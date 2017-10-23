package com.maghi711.javase8.greeting;

public class HelloGreeting implements Greeting {

    @Override
    public String greet(String message) {
        return (message == null) ? "Hello User": "Hello " + message;
    }
}
