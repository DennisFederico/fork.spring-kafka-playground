package org.github.ogomezso.scs.infrastructure.rest;

import org.github.ogomezso.scs.domain.TicketPort;
import org.github.ogomezso.scs.domain.model.Ticket;
import org.github.ogomezso.scs.infrastructure.kafka.TicketAdapter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TicketController {

  private final TicketAdapter ticketAdapter;

  @PostMapping("/ticket")
  ResponseEntity<String> sendTicket() {
    ticketAdapter.sendTicket();

    return ResponseEntity.ok("OK");
  }
}
