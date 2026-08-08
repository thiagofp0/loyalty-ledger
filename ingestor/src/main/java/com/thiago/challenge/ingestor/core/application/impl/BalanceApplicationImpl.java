package com.thiago.challenge.ingestor.core.application.impl;

import com.thiago.challenge.ingestor.core.application.BalanceApplication;
import com.thiago.challenge.ingestor.core.domain.model.BalanceMessage;

public class BalanceApplicationImpl implements BalanceApplication {
    @Override
    public void processBalanceMessage(BalanceMessage message) {
        System.out.println("Processing balance message: " + message);
    }
    
}
