package org.github.ogomezso.scs.domain.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class PaymentMethodCoupon {
   PaymentInfo couponPayment;
   String couponBarcode;
   String articleGtin;
   Integer forced;
   String couponIntroducedMethod;
   String couponDescription;
   String articleDescription;
}
