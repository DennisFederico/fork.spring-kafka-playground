package org.github.ogomezso.springkafka.domain.model;

import java.util.List;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Ticket {
  String companyId;
  TicketIdentity identity;
  TicketHeader header;
  Invoice invoice;
  List<TicketLine> lines;
  List<PaymentMethodCash> paymentMethodCash;
  List<PaymentMethodCreditCard> paymentMethodCreditCard;
  PaymentMethodBankTransfer paymentMethodBankTransfer;
  List<PaymentMethodCoupon> paymentMethodCoupon;
  List<TotalTax> totalTax;
  List<Scale> scale;
  List<ParkedLines> parkedLines;
}
