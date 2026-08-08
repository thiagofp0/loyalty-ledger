package com.thiago.challenge.ingestor.core.domain.model;

import java.util.Date;
import java.util.UUID;

import com.thiago.challenge.ingestor.core.domain.enums.BalanceEventTypeEnum;

import lombok.Data;

@Data
public class BalanceMessage {
    private UUID eventId;
    private String accountId;
    private BalanceEventTypeEnum type;
    private Integer points;
    private Date occurredAt;
}
