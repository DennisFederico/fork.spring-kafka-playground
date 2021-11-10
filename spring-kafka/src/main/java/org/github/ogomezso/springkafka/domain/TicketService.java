package org.github.ogomezso.springkafka.domain;

import org.github.ogomezso.springkafka.domain.model.Ticket;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TicketService implements TicketPort{

  private final TicketBuilder ticketBuilder;

  @Override
  public Ticket createNewTicket() {
    return ticketBuilder.createNewTicket();
  }
}
