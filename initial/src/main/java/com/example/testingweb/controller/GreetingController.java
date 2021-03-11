package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GreetingController {

    private final com.example.testingweb.serviceimport.GreetingService service;

    public GreetingController(com.example.testingweb.serviceimport.GreetingService service) {
        this.service = service;
    }

    @RequestMapping("/greeting")
    public @ResponseBody String greeting() {
        return service.greet();
    }

}