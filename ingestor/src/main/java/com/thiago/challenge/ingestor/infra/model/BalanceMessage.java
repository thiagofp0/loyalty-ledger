package com.thiago.challenge.ingestor.infra.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BalanceMessage {
    private String eventId;
    private String accountId;
    private String type;
    private Integer points;
    private String occurredAt;
}
