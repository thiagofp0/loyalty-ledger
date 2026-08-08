package com.thiago.challenge.ingestor.core.domain.entities;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Balance {
    private final String accountId;
    private final Double balance;
    private final String currency;
    private final Date lastUpdated;
}
