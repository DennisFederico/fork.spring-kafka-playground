package org.github.ogomezso.springkafka.domain;


import org.github.ogomezso.springkafka.domain.model.Ticket;

public interface TicketPort {

  Ticket createNewTicket();
}
