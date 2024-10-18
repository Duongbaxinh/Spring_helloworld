package com.example.helloworld;

import controller.Greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {

    public static void main(String[] args) {
        Greeting greeting = new Greeting("Hello World");
        greeting.greeting();
        greeting.welcome("Duong Ba Xinh");

    }

}
