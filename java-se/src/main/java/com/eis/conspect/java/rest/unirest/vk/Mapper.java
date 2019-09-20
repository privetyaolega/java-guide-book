package com.eis.conspect.java.rest.unirest.vk;

import utils.logger.CustomLogger;
import com.eis.conspect.java.rest.unirest.vk.model.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.slf4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapper {

    public static Logger log = CustomLogger.getInstance();
    public static final String BASE_URL = "https://api.vk.com/method/{method}";
    public static final String USERS_GET = "users.get";
    public static final String ACCESS_TOKEN = "8f67abb2fa5c8d2e27e154d169ff7d25065be3a2aea6a1c5aa682613b3399dfdde216396a9ec722881511";

    private final static ObjectMapper MAPPER = getMapper();

    public static List<User> getUsersGet(String id) throws Exception {

        String request = Unirest.get(BASE_URL)
                .routeParam("method", USERS_GET)
                .queryString(getRequiredData())
                .queryString("user_id", id).getUrl();
        log.info("Request : \n{}", request);

        HttpResponse<JsonNode> response = Unirest.get(request).asJson();

        Object json = getMapper().readValue(response.getBody().toString(), Object.class);
        log.info("Response : \n{}", getMapper().writerWithDefaultPrettyPrinter().writeValueAsString(json));

        return MAPPER.readValue(response.getBody().getObject().get("response").toString(),
                TypeFactory.defaultInstance().constructCollectionType(List.class, User.class));
    }

    public static User getUserGet(String id) throws Exception {
        return getUsersGet(id).get(0);
    }

    private static ObjectMapper getMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        // @JsonRootName(value = "user") wrap object with root value (json)
//        mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false);
//        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
        return mapper;
    }

    private static Map<String, Object> getRequiredData() {
        Map<String, Object> data = new HashMap<>();
        data.put("access_token", ACCESS_TOKEN);
        data.put("v", "5.8");
        return data;
    }

}