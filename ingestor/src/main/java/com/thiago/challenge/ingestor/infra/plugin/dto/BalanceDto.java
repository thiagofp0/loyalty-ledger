package com.thiago.challenge.ingestor.infra.plugin.dto;

import com.thiago.challenge.ingestor.core.domain.enums.BalanceEventTypeEnum;

import lombok.Data;

@Data
public class BalanceDto {
    private final String accountId;
    private final BalanceEventTypeEnum type;
    private final Integer points;
    private final String occurredAt;
    private final String currency;
}
