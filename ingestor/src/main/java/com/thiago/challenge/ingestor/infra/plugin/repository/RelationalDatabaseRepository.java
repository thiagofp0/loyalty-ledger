package com.thiago.challenge.ingestor.infra.plugin.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.thiago.challenge.ingestor.core.domain.entities.BalanceState;
import com.thiago.challenge.ingestor.core.repository.BalanceRepository;
import com.thiago.challenge.ingestor.infra.mapper.BalanceMapper;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class RelationalDatabaseRepository implements BalanceRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void createBalanceStateRegistry(BalanceState balanceState) {
       var sql = "INSERT INTO balance_states (account_id, type, points, occurred_at, currency) VALUES (?, ?, ?, ?, ?)";
       var balanceStateDto = BalanceMapper.toBalanceDto(balanceState);

        
        jdbcTemplate.update(
            sql, 
            balanceStateDto.getAccountId(), 
            balanceStateDto.getType().name(), 
            balanceStateDto.getPoints(), 
            balanceStateDto.getOccurredAt().toString(), 
            balanceStateDto.getCurrency());
    }

}
