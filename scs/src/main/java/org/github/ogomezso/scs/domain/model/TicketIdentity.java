package org.github.ogomezso.scs.domain.model;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class TicketIdentity {
  LocalDate ticketDate;
  String storePublicId;
  String ticketNumber;
  String posId;
}
