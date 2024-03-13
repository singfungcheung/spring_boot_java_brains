package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Tell Spring that this is a Spring application.
public class CourseApiApp {
    public static void main(String[] args){
        // Create a server container and host the application in the server container.
        SpringApplication.run(CourseApiApp.class, args);

        // Should see "Started CourseApiApp". Go to localhost:8080 in browser.
    }
}
