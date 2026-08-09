package com.thiago.challenge.ingestor.core.application.impl;

import org.springframework.stereotype.Service;

import com.thiago.challenge.ingestor.core.application.BalanceApplication;
import com.thiago.challenge.ingestor.core.domain.entities.BalanceState;

@Service
public class BalanceApplicationImpl implements BalanceApplication {
    @Override
    public void processBalanceMessage(BalanceState message) {
        System.out.println("Processing balance message: " + message.getAccountId());
    }
}
