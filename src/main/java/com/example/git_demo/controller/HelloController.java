package com.example.git_demo.controller;


import com.example.git_demo.model.Greeting;
import com.example.git_demo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private GreetingService greetingService;

    // http://localhost:8080/greet?name=John
    @GetMapping("/greet")
    public Greeting greet(@RequestParam(name = "name", defaultValue = "World") String name) {
        return greetingService.getGreeting(name);
    }
}
