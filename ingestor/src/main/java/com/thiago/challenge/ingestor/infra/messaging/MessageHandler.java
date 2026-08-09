package com.thiago.challenge.ingestor.infra.messaging;

import com.thiago.challenge.ingestor.infra.model.BalanceMessage;

public interface MessageHandler {
    void handleMessage(BalanceMessage message);
}
