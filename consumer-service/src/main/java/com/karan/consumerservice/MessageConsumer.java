package com.karan.consumerservice;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class MessageConsumer {

    @Bean
    public Consumer<String> messageReceiver(){
        return message -> {
            System.out.println("Received message: " + message);
        };
    }

}
