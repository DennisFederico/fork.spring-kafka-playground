package org.github.ogomezso.scs.infrastructure.kafka;

import org.github.ogomezso.scs.domain.TicketPort;
import org.github.ogomezso.scs.domain.model.Ticket;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;
import org.springframework.util.MimeType;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TicketProducer implements TicketAdapter {

  private final TicketMapper ticketMapper;
  private final TicketPort ticketPort;
  private final StreamBridge streamBridge;

  @Override
  public void sendTicket() {
    Ticket ticket = ticketPort.createNewTicket();
    streamBridge.send("ticketProcessor-out-0", ticketMapper.toAvro(ticket), MimeType.valueOf("application/*+avro"));
  }
}
