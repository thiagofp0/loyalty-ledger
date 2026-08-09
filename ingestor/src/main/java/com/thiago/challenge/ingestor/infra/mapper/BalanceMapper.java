package com.thiago.challenge.ingestor.infra.mapper;

import com.thiago.challenge.ingestor.core.domain.entities.BalanceState;
import com.thiago.challenge.ingestor.core.domain.enums.BalanceEventTypeEnum;
import com.thiago.challenge.ingestor.infra.model.BalanceMessage;

import lombok.experimental.UtilityClass;

@UtilityClass
public class BalanceMapper {
    public BalanceState toBalanceState(BalanceMessage balanceMessage){
        return BalanceState.builder()
                .accountId(balanceMessage.getAccountId())
                .type(BalanceEventTypeEnum.valueOf(balanceMessage.getType()))
                .points(balanceMessage.getPoints())
                .occurredAt(balanceMessage.getOccurredAt())
                .currency("USD")
                .build();
    }
}
