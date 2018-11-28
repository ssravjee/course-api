package com.keepleritlimited.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CourseApiApp {
    public static void main(String[] args){
        SpringApplication.run(CourseApiApp.class, args);
        System.out.println("how r u doing..");

    }
    @Bean
    CommandLineRunner runner() {
        return args -> {

        };
    }
}


