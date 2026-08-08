package com.thiago.challenge.ingestor.infra.messaging;

public interface MessageHandler {
    void handleMessage(String message);
}
