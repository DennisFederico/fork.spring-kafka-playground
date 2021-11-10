package org.github.ogomezso.scs.infrastructure.kafka;

import java.util.function.Function;

import org.github.ogomezso.scs.infrastructure.model.ticket.TicketMessage;

public class TicketProcessor implements Function<TicketMessage,TicketMessage> {


  @Override
  public TicketMessage apply(TicketMessage ticketMessage) {
    return ticketMessage;
  }
}
