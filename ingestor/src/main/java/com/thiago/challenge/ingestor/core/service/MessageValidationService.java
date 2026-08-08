package com.thiago.challenge.ingestor.core.service;

import com.thiago.challenge.ingestor.core.domain.model.BalanceMessage;

public interface MessageValidationService {
    boolean validateMessage(BalanceMessage message);
}
