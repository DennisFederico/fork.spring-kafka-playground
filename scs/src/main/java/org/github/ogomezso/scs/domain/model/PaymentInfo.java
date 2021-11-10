package org.github.ogomezso.scs.domain.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class PaymentInfo {
  String paymentMethodId;
  String paymentMethodAmount;
}
