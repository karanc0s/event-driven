package com.karan.consumerservice;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class MessageConsumer {

    @Bean
    public Function<String , String> messageReceiver(){
        return message -> {
            System.out.println("Received message: " + message);
            processData();
            return "Data Processed";
        };
    }


    private void processData(){
        System.out.println("Initializing Data");
        System.out.println("Processing data");
        try {
            Thread.sleep(200);
        }catch (Exception ignored){}
        System.out.println("Uploading Data");
        try {
            Thread.sleep(500);
        }catch (Exception ignored){}
        System.out.println("Encrypting  Data");
        try {
            Thread.sleep(100);
        }catch (Exception ignored){}
        System.out.println("Creating Metadata");
        System.out.println("Success");

    }

}
