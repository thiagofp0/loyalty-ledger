package com.thiago.challenge.ingestor.core.domain.entities;

import java.time.LocalDate;

import com.thiago.challenge.ingestor.core.domain.enums.BalanceEventTypeEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class BalanceState {
    private final String accountId;
    private final BalanceEventTypeEnum type;
    private final Integer points;
    private final String occurredAt;
    private final String currency;
}
