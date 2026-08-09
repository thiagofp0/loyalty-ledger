package com.thiago.challenge.ingestor.core.application;

import com.thiago.challenge.ingestor.core.domain.entities.BalanceState;

public interface BalanceApplication {
    void processBalanceState(BalanceState message);
}
