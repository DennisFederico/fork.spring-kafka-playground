package org.github.ogomezso.scs.infrastructure.kafka;

import java.util.function.Function;

import org.github.ogomezso.scs.infrastructure.model.ticket.TicketMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TicketFunction {

  @Bean
  public Function<TicketMessage, TicketMessage> ticketProcessor() {
    return (ticket) -> ticket;
  }
}
