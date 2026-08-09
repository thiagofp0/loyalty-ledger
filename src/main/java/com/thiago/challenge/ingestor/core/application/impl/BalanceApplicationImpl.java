package com.thiago.challenge.ingestor.core.application.impl;

import org.springframework.stereotype.Service;

import com.thiago.challenge.ingestor.core.application.BalanceApplication;
import com.thiago.challenge.ingestor.core.domain.entities.BalanceState;
import com.thiago.challenge.ingestor.core.service.BalanceService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BalanceApplicationImpl implements BalanceApplication {

    private final BalanceService balanceService;

    @Override
    public void processBalanceState(BalanceState message) {
        balanceService.processBalanceState(message);
    }
}
