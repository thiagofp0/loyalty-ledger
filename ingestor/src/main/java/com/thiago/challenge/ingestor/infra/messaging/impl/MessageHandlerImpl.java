package com.thiago.challenge.ingestor.infra.messaging.impl;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.thiago.challenge.ingestor.core.application.BalanceApplication;
import com.thiago.challenge.ingestor.infra.mapper.BalanceMapper;
import com.thiago.challenge.ingestor.infra.messaging.MessageHandler;
import com.thiago.challenge.ingestor.infra.model.BalanceMessage;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MessageHandlerImpl implements MessageHandler {

    private final BalanceApplication balanceApplication;

    @RabbitListener(queues = "BALANCE-QUEUE")
    public void handleMessage(BalanceMessage message) {
        balanceApplication.processBalanceMessage(BalanceMapper.toBalanceState(message));
    }
}