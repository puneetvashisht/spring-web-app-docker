package com.icici.spring_web_app_docker;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class SampleController {

    @Autowired
    SampleService sampleService;

    @GetMapping("/hello")
    public String hello() {
        sampleService.callExternalService();
        return "Hello, World!";
    }
}
