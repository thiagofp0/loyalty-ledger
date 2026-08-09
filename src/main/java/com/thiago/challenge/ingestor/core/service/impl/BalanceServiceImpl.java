package com.thiago.challenge.ingestor.core.service.impl;

import org.springframework.stereotype.Service;

import com.thiago.challenge.ingestor.core.domain.entities.BalanceState;
import com.thiago.challenge.ingestor.core.repository.BalanceRepository;
import com.thiago.challenge.ingestor.core.service.BalanceService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BalanceServiceImpl implements BalanceService{

    private final BalanceRepository balanceRepository;

    @Override
    public void processBalanceState(BalanceState message) {
        balanceRepository.createBalanceStateRegistry(message);
    } 
}
