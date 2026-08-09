package com.thiago.challenge.ingestor.core.service;

import com.thiago.challenge.ingestor.infra.model.BalanceMessage;

public interface MessageValidationService {
    boolean validateMessage(BalanceMessage message);
}
