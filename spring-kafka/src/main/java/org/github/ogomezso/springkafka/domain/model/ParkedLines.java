package org.github.ogomezso.springkafka.domain.model;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class ParkedLines {
  String employeeId;
  LocalDateTime parkedTime;
  String parkedType;
  Integer lineNumber;
  String amountLine;
}
