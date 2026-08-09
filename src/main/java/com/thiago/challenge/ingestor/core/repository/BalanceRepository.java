package com.thiago.challenge.ingestor.core.repository;

import com.thiago.challenge.ingestor.core.domain.entities.BalanceState;

public interface BalanceRepository {
    void createBalanceStateRegistry(BalanceState balanceState);
}
