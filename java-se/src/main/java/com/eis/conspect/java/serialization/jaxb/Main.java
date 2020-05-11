package com.eis.conspect.java.serialization.jaxb;

import com.eis.conspect.java.serialization.jaxb.model.Model;
import com.eis.conspect.java.serialization.jaxb.model.SubjectModel;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Arrays;
import java.util.Random;

public class Main {

    private static File jaxbTestXml = new File("src/main/java/com/eis/conspect/java/serialization/jaxb/files/jaxbTestXml.xml");

    public static void main(String[] args) throws JAXBException {

        Model model = createNewEntity();
        File xmlWithModel = marshallingModel(model);

        Model modelFromXml = unmarshallingModel(new Model(), jaxbTestXml);

        System.out.println(modelFromXml.getDob().getDayOfWeek());
        System.out.println(modelFromXml.getDob().toString());
    }

    //----------------------------------------------------------------------------------------------------------------//

    /**
     *      Model -> XML
     */
    public static <T> File marshallingModel(T model) throws JAXBException {

        File newFile = new File("src/main/java/com/eis/conspect/java/serialization/jaxb/files/"
                + Model.class.getSimpleName() + Math.abs(new Random().nextInt()) + ".xml");
        Marshaller marshaller = JAXBContext.newInstance(model.getClass()).createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(model, newFile);
        return newFile;
    }

    /**
     *      XML -> Model
     */
    public static <T> T unmarshallingModel(T model, File xmlFile) throws JAXBException {
        Unmarshaller unmarshaller = JAXBContext.newInstance(model.getClass()).createUnmarshaller();
        model = (T) unmarshaller.unmarshal(xmlFile);
        return model;
    }

    public static Model createNewEntity() {
        SubjectModel sm = new SubjectModel();
        sm.setName("English");
        sm.setPoint(10.0);

        SubjectModel sm1 = new SubjectModel();
        sm1.setName("Math");
        sm1.setPoint(7.3);

        SubjectModel sm2 = new SubjectModel();
        sm2.setName("Geography");
        sm2.setPoint(3.3);

        Model model = new Model();
        model.setAge(23);
        model.setName("Dmitry");
        model.setSubjects(Arrays.asList(sm, sm1, sm2));

        return model;
    }

}
