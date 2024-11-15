package com.example.git_demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {


    // http://localhost:8080/hello
    @GetMapping("/hello")
    public String sayHello(@RequestParam(name = "name", defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }



  

    // http://localhost:8080/reverse
    @PostMapping("/reverse")
    public String reverseString(@RequestBody String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // http://localhost:8080/welcome/London
    @GetMapping("/welcome/{city}")
    public String welcomeCity(@PathVariable String city) {
        return "Welcome to " + city + "!";
    }

    // http://localhost:8080/health
    @GetMapping("/health")
    public String healthCheck() {
        return "The server is running!";
    }

    // http://localhost:8080/user
    @GetMapping("/user")
    public Map<String, String> getUserDetails() {
        Map<String, String> user = new HashMap<>();
        user.put("name", "John Doe");
        user.put("email", "john.doe@example.com");
        return user;
    }


    //
    private final ArrayList<String> data = new ArrayList<>();

    // http://localhost:8080/data    with body: "Sample Data"
    @PostMapping("/data")
    public String addData(@RequestBody String value) {
        data.add(value);
        return "Data added: " + value;
    }

    // http://localhost:8080/data
    @GetMapping("/data")
    public ArrayList<String> getAllData() {
        return data;
    }




}