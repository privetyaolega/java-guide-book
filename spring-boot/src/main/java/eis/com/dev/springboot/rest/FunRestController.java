package eis.com.dev.springboot.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello ! Time on server " + LocalDateTime.now();
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello  on server " + LocalDateTime.now();
    }
}
