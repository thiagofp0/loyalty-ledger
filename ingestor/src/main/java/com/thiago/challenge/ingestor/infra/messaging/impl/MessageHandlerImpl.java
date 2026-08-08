package com.thiago.challenge.ingestor.infra.messaging.impl;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.thiago.challenge.ingestor.infra.messaging.MessageHandler;

@Component
public class MessageHandlerImpl implements MessageHandler {

    @RabbitListener(queues = "BALANCE-QUEUE")
    public void handleMessage(String message) {
        System.out.println("Received message: " + message);
    }
}