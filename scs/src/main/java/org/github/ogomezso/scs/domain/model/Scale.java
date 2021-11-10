package org.github.ogomezso.scs.domain.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Scale {
  String linedNumberScale;
  String scaleDate;
  String scaleHour;
  String scaleId;
  String groupId;
  String scaleTicketId;
  String scaleOperatorId;
  String scaleAmount;
  String scaleTicketType;
}
