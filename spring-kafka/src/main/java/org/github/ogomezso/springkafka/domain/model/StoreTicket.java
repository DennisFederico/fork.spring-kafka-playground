package org.github.ogomezso.springkafka.domain.model;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class StoreTicket {
  LocalDate ticketDate;
  String storePublicId;
  String ticketNumber;
  String posId;
}
