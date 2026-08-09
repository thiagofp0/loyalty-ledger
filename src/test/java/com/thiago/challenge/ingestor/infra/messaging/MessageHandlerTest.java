package com.thiago.challenge.ingestor.infra.messaging;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.thiago.challenge.ingestor.core.application.BalanceApplication;
import com.thiago.challenge.ingestor.core.domain.entities.BalanceState;
import com.thiago.challenge.ingestor.core.domain.enums.BalanceEventTypeEnum;
import com.thiago.challenge.ingestor.infra.model.BalanceMessage;
import com.thiago.challenge.ingestor.infra.messaging.impl.MessageHandlerImpl;

@ExtendWith(MockitoExtension.class)
class MessageHandlerTest {

    @Mock
    private BalanceApplication balanceApplication;

    @InjectMocks
    private MessageHandlerImpl messageHandler;

    @Test
    void shouldHandleMessage() {
        BalanceMessage message = new BalanceMessage();
        message.setEventId("event-1");
        message.setAccountId("account-1");
        message.setType("EARN");
        message.setPoints(150);
        message.setOccurredAt("2026-08-08T10:15:30Z");

        messageHandler.handleMessage(message);

        verify(balanceApplication).processBalanceState(any(BalanceState.class));
    }

    @Test
    void shouldMapMessageBeforeDelegating() {
        BalanceMessage message = new BalanceMessage();
        message.setEventId("event-2");
        message.setAccountId("account-2");
        message.setType("REDEEM");
        message.setPoints(75);
        message.setOccurredAt("2026-08-08T11:00:00Z");

        messageHandler.handleMessage(message);

        var stateCaptor = org.mockito.ArgumentCaptor.forClass(BalanceState.class);

        verify(balanceApplication).processBalanceState(stateCaptor.capture());

        BalanceState state = stateCaptor.getValue();
        assertEquals("account-2", state.getAccountId());
        assertEquals(BalanceEventTypeEnum.REDEEM, state.getType());
        assertEquals(75, state.getPoints());
        assertEquals("2026-08-08T11:00:00Z", state.getOccurredAt());
        assertEquals("USD", state.getCurrency());
    }
}
