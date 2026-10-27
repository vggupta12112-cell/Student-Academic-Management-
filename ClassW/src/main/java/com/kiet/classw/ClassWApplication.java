package com.kiet.classw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class ClassWApplication {

    private static final Logger logger =
            LoggerFactory.getLogger(ClassWApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ClassWApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            logger.info("KIET Student Management System Started");
            logger.info("Loading Student Data...");
            logger.info("Student Management REST API is Ready");
        };
    }
}