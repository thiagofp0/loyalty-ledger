package com.thiago.challenge.ingestor.infra.messaging;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessagingConfig {
    @Bean
    Queue minhaFila() {
        return new Queue("BALANCE-QUEUE", true);
    }
}
