package com.example.helloworld;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
public class LoadProcessApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoadProcessApplication.class, args);
    }

}
