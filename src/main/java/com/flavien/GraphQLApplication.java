package com.flavien;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The GraphQLApplication class serves as the entry point for the Spring Boot
 * application.
 */
@SpringBootApplication
public class GraphQLApplication {

    /**
     * The entry point of the Spring Boot GraphQL application.
     *
     * @param args Command line arguments passed to the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(GraphQLApplication.class, args);
    }

}
