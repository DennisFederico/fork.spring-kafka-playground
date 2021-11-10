package org.github.ogomezso.springkafka.infrastructure.kafka;

import org.github.ogomezso.springkafka.domain.TicketPort;
import org.github.ogomezso.springkafka.domain.model.Ticket;

import org.github.ogomezso.springkafka.infrastructure.model.ticket.TicketMessage;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
class TicketMessageService implements TicketMessageAdapter {

  private final TicketPort ticketPort;
  private final TicketMapper ticketMapper;
  private final TicketProducer ticketProducer;

  @Override
  public void sendTicket() {

    Ticket ticket = ticketPort.createNewTicket();

    TicketMessage ticketMessage = ticketMapper.toAvro(ticket);

    ticketProducer.send(ticketMessage);
  }
}
