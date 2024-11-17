package com.karan.producerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private StreamBridge streamBridge;

    @GetMapping("/send")
    public String sendMessage() {
        String message = "Hello from Producer! kida babeo";
        boolean send = streamBridge.send("producedEvent-out-0", message);
        if(send){
            return "message sent : "+message;
        }else {
            return "message not sent";
        }
    }

}
