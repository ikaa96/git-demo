package com.example.git_demo.service;


import com.example.git_demo.model.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public Greeting getGreeting(String name) {
        String message = "Hello, " + name + "!";
        return new Greeting(message, name);
    }
}