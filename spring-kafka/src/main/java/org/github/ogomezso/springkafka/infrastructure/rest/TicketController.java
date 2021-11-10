package org.github.ogomezso.springkafka.infrastructure.rest;

import org.github.ogomezso.springkafka.infrastructure.kafka.TicketMessageAdapter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TicketController {

  private final TicketMessageAdapter ticketMessageAdapter;

  @PostMapping("/ticket")
  ResponseEntity<String> sendTicket() {
    ticketMessageAdapter.sendTicket();

    return ResponseEntity.ok("OK");
  }

}
