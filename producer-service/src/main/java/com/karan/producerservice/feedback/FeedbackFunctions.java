package com.karan.producerservice.feedback;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class FeedbackFunctions {

    @Bean
    public Consumer<String> processFeedback() {
        return str -> {
            System.out.println("Acknowledged: " + str);
        };
    }



}
