package org.github.ogomezso.springkafka.domain.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class TotalTax {
  String taxClass;
  String taxType;
  String taxRate;
  String taxBase;
  String taxCharge;
  Boolean isTaxIncluded;
  String vatLetter;

}
