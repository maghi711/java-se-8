package com.maghi711.javase8.greeting;

public class GreeterCheck {

    public static void main(String[] args) {
        Greeting greeting = new HelloGreeting();
        System.out.println("greeting.greet(null) = " + greeting.greet(null));
        System.out.println("greeting.greet(null) = " + greeting.greet("Aadavan"));

        // With Java 8 Lambda Expression
        Greeting greeting1 = (String message) ->
                (message == null) ? "Hello User" : "Hello " + message;
        System.out.println("Empty Greeting is " + greeting1.greet(null));
        System.out.println("Specific Greeting is " + greeting1.greet("Aadavan"));
    }
}
