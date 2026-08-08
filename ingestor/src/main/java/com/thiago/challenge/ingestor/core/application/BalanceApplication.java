package com.thiago.challenge.ingestor.core.application;

import com.thiago.challenge.ingestor.core.domain.model.BalanceMessage;

public interface BalanceApplication {
    void processBalanceMessage(BalanceMessage message);
}
