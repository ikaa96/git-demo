package com.example.git_demo.model;


//This model will hold the data for a greeting message and the recipient's name.

public class Greeting {
    private String message;
    private String name;

    // Constructor
    public Greeting(String message, String name) {
        this.message = message;
        this.name = name;
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
