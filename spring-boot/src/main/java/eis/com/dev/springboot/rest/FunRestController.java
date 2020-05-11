package eis.com.dev.springboot.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String helloWorld() {
        return "Hello " + coachName + "! Time on server " + LocalDateTime.now();
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello o1111111n server " + LocalDateTime.now();
    }

    @GetMapping("/team-info")
    public String teamInfo() {
        return "Hello " + coachName + "!\n" + "Your team: " + teamName;
    }
}
