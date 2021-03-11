package com.example.testingweb.serviceimport;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet() {
        return "Congratulations! You are viewing the completion of my Spring application lab that I tested with JUnit " +
                "and Spring MockMvc and have used Spring Boot to isolate the web layer and load a special application context.";
    }
}
