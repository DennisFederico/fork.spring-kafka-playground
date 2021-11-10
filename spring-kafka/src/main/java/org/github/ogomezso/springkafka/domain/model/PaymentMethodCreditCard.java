package org.github.ogomezso.springkafka.domain.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class PaymentMethodCreditCard {
  PaymentInfo cardPayment;
  String creditCardId;
  String expirationDate;
  String introductionMethodCard;
  Boolean isSigned;
  String token;
  String pinPad;
  String period;
  String operationNumber;
  String receipt;
  Boolean isCancelled;
}
