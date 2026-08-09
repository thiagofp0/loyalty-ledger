package com.thiago.challenge.ingestor.core.service;

import com.thiago.challenge.ingestor.core.domain.entities.BalanceState;

public interface BalanceService {
    void processBalanceState(BalanceState message);
}
