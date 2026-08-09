package com.thiago.challenge.ingestor.core.domain.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.thiago.challenge.ingestor.core.domain.enums.BalanceEventTypeEnum;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BalanceState {
    private final String accountId;
    private final BalanceEventTypeEnum type;
    private final Integer points;
    private final String occurredAt;
    private final String currency;

    public BalanceState(String accountId, BalanceEventTypeEnum type, Integer points, String occurredAt, String currency) {

        if (accountId == null || accountId.isEmpty()) {
            throw new IllegalArgumentException("Account ID cannot be null or empty");
        }
        if (type == null || BalanceEventTypeEnum.valueOf(type.name()) == null) {
            throw new IllegalArgumentException("Type cannot be null or invalid");
        }
        if (points == null) {
            throw new IllegalArgumentException("Points cannot be null");
        }
        if (occurredAt == null || occurredAt.isEmpty()) {
            throw new IllegalArgumentException("Occurred at cannot be null or empty");
        }
        if (LocalDateTime.parse(occurredAt, DateTimeFormatter.ISO_DATE_TIME).isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("Occurred at cannot be in the future");
        }
        if (currency == null || currency.isEmpty()) {
            throw new IllegalArgumentException("Currency cannot be null or empty");
        }

        this.accountId = accountId;
        this.type = type;
        this.points = points;
        this.occurredAt = occurredAt;
        this.currency = currency;
    }
}
