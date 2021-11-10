package org.github.ogomezso.scs.infrastructure.kafka;

import java.util.List;
import java.util.stream.Collectors;

import org.github.ogomezso.scs.domain.model.ParkedLines;
import org.github.ogomezso.scs.domain.model.PaymentMethodBankTransfer;
import org.github.ogomezso.scs.domain.model.PaymentMethodCash;
import org.github.ogomezso.scs.domain.model.PaymentMethodCoupon;
import org.github.ogomezso.scs.domain.model.PaymentMethodCreditCard;
import org.github.ogomezso.scs.domain.model.Scale;
import org.github.ogomezso.scs.domain.model.StoreTicket;
import org.github.ogomezso.scs.domain.model.Ticket;
import org.github.ogomezso.scs.domain.model.TicketHeader;
import org.github.ogomezso.scs.domain.model.TicketIdentity;
import org.github.ogomezso.scs.domain.model.TicketLine;
import org.github.ogomezso.scs.domain.model.TotalTax;
import org.github.ogomezso.scs.infrastructure.model.ticket.CardPayment;
import org.github.ogomezso.scs.infrastructure.model.ticket.CashPayment;
import org.github.ogomezso.scs.infrastructure.model.ticket.CouponPayment;
import org.github.ogomezso.scs.infrastructure.model.ticket.Header;
import org.github.ogomezso.scs.infrastructure.model.ticket.Identity;
import org.github.ogomezso.scs.infrastructure.model.ticket.Invoice;
import org.github.ogomezso.scs.infrastructure.model.ticket.LinesRecord;
import org.github.ogomezso.scs.infrastructure.model.ticket.OriginStoreTicket;
import org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord;
import org.github.ogomezso.scs.infrastructure.model.ticket.PaymentMethodCashRecord;
import org.github.ogomezso.scs.infrastructure.model.ticket.PaymentMethodCouponRecord;
import org.github.ogomezso.scs.infrastructure.model.ticket.PaymentMethodCreditCardRecord;
import org.github.ogomezso.scs.infrastructure.model.ticket.PaymentMethodbankTransfer;
import org.github.ogomezso.scs.infrastructure.model.ticket.ReturnStoreTicket;
import org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord;
import org.github.ogomezso.scs.infrastructure.model.ticket.TicketLineTax;
import org.github.ogomezso.scs.infrastructure.model.ticket.TicketMessage;
import org.github.ogomezso.scs.infrastructure.model.ticket.TotalTaxRecord;
import org.github.ogomezso.scs.infrastructure.model.ticket.TransferPayment;
import org.springframework.stereotype.Component;

@Component
public class TicketMapper {

  public TicketMessage toAvro(Ticket ticket) {

    return TicketMessage.newBuilder()
        .setCompanyId(ticket.getCompanyId())
        .setHeader(mapTicketHeader(ticket.getHeader()))
        .setIdentity(mapIdentity(ticket.getIdentity()))
        .setInvoice(mapInvoice(ticket.getInvoice()))
        .setLines(mapLines(ticket.getLines()))
        .setParkedLines(mapParkedLines(ticket.getParkedLines()))
        .setPaymentMethodbankTransfer(
            mapPaymentMethodbankTransfer(ticket.getPaymentMethodBankTransfer()))
        .setPaymentMethodCash(mapPaymentMethodCash(ticket.getPaymentMethodCash()))
        .setPaymentMethodCoupon(mapPaymentMethodCoupon(ticket.getPaymentMethodCoupon()))
        .setPaymentMethodCreditCard(
            mapPaymentMethodCreditCard(ticket.getPaymentMethodCreditCard()))
        .setScale(mapScale(ticket.getScale()))
        .setTotalTax(mapTotalTax(ticket.getTotalTax()))
        .build();
  }

  private List<TotalTaxRecord> mapTotalTax(List<TotalTax> totalTax) {

    return totalTax.stream().map(
        t -> TotalTaxRecord.newBuilder()
            .setIsTaxIncluded(t.getIsTaxIncluded())
            .setTaxBase(t.getTaxBase())
            .setTaxCharge(t.getTaxCharge())
            .setTaxClass(t.getTaxClass())
            .setTaxRate(t.getTaxRate())
            .setTaxType(t.getTaxType())
            .setVatLetter(t.getVatLetter())
            .build()
    ).collect(Collectors.toList());
  }

  private List<ScaleRecord> mapScale(List<Scale> scale) {
    return scale.stream().map(s -> ScaleRecord.newBuilder()
        .setGroupId(s.getGroupId())
        .setScaleDate(s.getScaleDate())
        .setScaleAmount(s.getScaleAmount())
        .setScaleHour(s.getScaleHour())
        .setLineNumberScale(s.getLinedNumberScale())
        .setScaleId(s.getScaleId())
        .setScaleOperatorId(s.getScaleOperatorId())
        .setScaleTicketType(s.getScaleTicketType())
        .setScaleTicketId(s.getScaleTicketId())
        .build()
    ).collect(Collectors.toList());
  }

  private List<PaymentMethodCreditCardRecord> mapPaymentMethodCreditCard(
      List<PaymentMethodCreditCard> paymentMethodCreditCard) {
    return paymentMethodCreditCard.stream().map(p -> {
          CardPayment cardPayment = CardPayment.newBuilder()
              .setPaymentMethodId(p.getCardPayment().getPaymentMethodId())
              .setPaymentMethodAmount(p.getCardPayment().getPaymentMethodAmount())
              .build();
          return PaymentMethodCreditCardRecord.newBuilder()
              .setCardPayment(cardPayment)
              .setCreditCardId(p.getCreditCardId())
              .setExpirationDate(p.getExpirationDate())
              .setIsCancelled(p.getIsCancelled())
              .setIsSigned(p.getIsSigned())
              .setIntroductionMethodCard(p.getIntroductionMethodCard())
              .setPeriod(p.getPeriod())
              .setPinpadId(p.getPinPad())
              .setOperationNumber(p.getOperationNumber())
              .setReceipt(p.getReceipt())
              .setToken(p.getToken())
              .build();
        }
    ).collect(Collectors.toList());
  }

  private List<PaymentMethodCouponRecord> mapPaymentMethodCoupon(
      List<PaymentMethodCoupon> paymentMethodCoupon) {
    return paymentMethodCoupon.stream().map(p -> {
              CouponPayment couponPayment = CouponPayment.newBuilder()
                  .setPaymentMethodId(p.getCouponPayment().getPaymentMethodId())
                  .setPaymentMethodAmount(p.getCouponPayment().getPaymentMethodAmount())
                  .build();
              return PaymentMethodCouponRecord.newBuilder()
                  .setCouponPayment(couponPayment)
                  .setArticleGtin(p.getArticleGtin())
                  .setArticleDescription(p.getArticleDescription())
                  .setCouponBarcode(p.getCouponBarcode())
                  .setCouponDescription(p.getCouponDescription())
                  .setCouponIntroductionMethod(p.getCouponIntroducedMethod())
                  .setForced(p.getForced())
                  .build();
            }
        )
        .collect(Collectors.toList());
  }

  private List<PaymentMethodCashRecord> mapPaymentMethodCash(
      List<PaymentMethodCash> paymentMethodCash) {

    return paymentMethodCash.stream().map(p -> {
          CashPayment cashPayment = CashPayment.newBuilder()
              .setPaymentMethodId(p.getCashPayment().getPaymentMethodId())
              .setPaymentMethodAmount(p.getCashPayment().getPaymentMethodAmount())
              .build();
          return PaymentMethodCashRecord.newBuilder()
              .setCashPayment(cashPayment)
              .setIsPendingCash(p.getIsPendingCash())
              .setIsCancelled(p.getIsCancelled())
              .build();
        }

    ).collect(Collectors.toList());
  }

  private PaymentMethodbankTransfer mapPaymentMethodbankTransfer(
      PaymentMethodBankTransfer paymentMethodBankTransfer) {

    TransferPayment transferPayment = TransferPayment.newBuilder()
        .setPaymentMethodId(
            paymentMethodBankTransfer.getTransferPayment().getPaymentMethodId())
        .setPaymentMethodAmount(
            paymentMethodBankTransfer.getTransferPayment().getPaymentMethodAmount())
        .build();
    return PaymentMethodbankTransfer.newBuilder()
        .setTransferPayment(transferPayment)
        .setAuthorizedNif(paymentMethodBankTransfer.getAuthorizedNif())
        .build();
  }

  private List<ParkedLinesRecord> mapParkedLines(List<ParkedLines> parkedLines) {
    return parkedLines.stream().map(lines -> ParkedLinesRecord.newBuilder()
            .setAmountLine(lines.getAmountLine())
            .setEmployeeId(lines.getEmployeeId())
            .setParkedTime(lines.getParkedTime().toString())
            .setParkedType(lines.getParkedType())
            .setLineNumber(lines.getLineNumber())
            .build())
        .collect(Collectors.toList());
  }

  private List<LinesRecord> mapLines(List<TicketLine> lines) {
    return lines.stream().map(l -> {

          TicketLineTax ticketLineTax = TicketLineTax.newBuilder()
              .setTaxBase(l.getTicketLineTax().getTaxBase())
              .setIsTaxIncluded(l.getTicketLineTax().getIsTaxIncluded())
              .setTaxCharge(l.getTicketLineTax().getTaxCharge())
              .setTaxClass(l.getTicketLineTax().getTaxClass())
              .setTaxType(l.getTicketLineTax().getTaxType())
              .setTaxRate(l.getTicketLineTax().getTaxRate())
              .setVatLetter(l.getTicketLineTax().getVatLetter())
              .build();

          return LinesRecord.newBuilder()
              .setAuxiliarBarcode(l.getAuxiliarBarcode())
              .setGrossPvp(l.getGrossPvp())
              .setGtin(l.getGtin())
              .setLineNumber(l.getLineNumber())
              .setLineAmount(l.getLineAmount())
              .setIntroductionMethod(l.getIntroductionMethod())
              .setTicketLineTax(ticketLineTax)
              .setTransactionLineTypeId(l.getTransactionLineTypeId())
              .setIsVatSplitted(l.getIsVatSplitted())
              .setProductDenomination(l.getProductDenomination())
              .setProductPublicId(l.getProductPublicId())
              .setPvp(l.getPvp())
              .setQuantity(l.getQuantity())
              .setTypeOfLine(l.getTypeOfLine())
              .setTypeOfTicketLine(l.getTypeOfTicketLine())
              .setUnknownProductPublicId(l.getUnknownProductPublicId())
              .setSectionId(l.getSectionId())
              .setSaleTypeScale(l.getSaleTypeScale())
              .build();

        })
        .collect(Collectors.toList());
  }

  private Invoice mapInvoice(org.github.ogomezso.scs.domain.model.Invoice invoice) {
    return Invoice.newBuilder()
        .setInvoiceHandOverTypeId(invoice.getInvoiceHandOverTypeId())
        .setBranchOfficeId(invoice.getBranchOfficeId())
        .setVatNumber(invoice.getVatNumber())
        .build();
  }

  private Identity mapIdentity(TicketIdentity identity) {
    return Identity.newBuilder()
        .setTicketDate(identity.getTicketDate().toString())
        .setPosId(identity.getPosId())
        .setTicketNumber(identity.getTicketNumber())
        .setStorePublicId(identity.getStorePublicId())
        .build();
  }

  private Header mapTicketHeader(TicketHeader header) {
    return Header.newBuilder()
        .setBarcode(header.getBarcode())
        .setCertificationCode(header.getCertificationCode())
        .setCompanyName(header.getCompanyName())
        .setEmployeeId(header.getEmployeeId())
        .setCompanyVatNumber(header.getCompanyVatNumber())
        .setDeliveryNoteDate(header.getDeliveryNoteDate().toString())
        .setDeliveryNoteNumber(header.getDeliveryNoteNumber())
        .setIsDigitalTicket(header.getIsDigitalTicket())
        .setDeliveryNotePosId(header.getDeliveryNotePosId())
        .setInvoiceDuration(header.getInvoiceDuration().intValue())
        .setEncodedCustomerId(header.getEncodedCustomerId())
        .setTicketHour(header.getTicketHour().getHour())
        .setOriginStoreTicket(mapOriginStoreTicket(header.getOriginStoreTicket()))
        .setSalesChannelId(header.getSalesChannelId())
        .setTicketTypeId(header.getTicketTypeId())
        .setTotalTicketAmount(header.getTotalTicketAmount())
        .setLocale(header.getLocale())
        .setReturnStoreTicket(mapReturnStoreTicket(header.getReturnStoreTicket()))
        .setStoreAddress(header.getStoreAddress())
        .setStoreCity(header.getStoreCity())
        .setStorePhone(header.getStorePhone())
        .setStoreTypeId(header.getStoreTypeId())
        .setStoreZipCode(header.getStoreZipCode())
        .setTeleSalesOrderNumber(header.getTeleSalesOrderNumber())
        .setPaymentDuration(header.getPaymentDuration().intValue())
        .setIsParked(header.getIsParked())
        .setTransactionTypeId(header.getTransactionTypeId())
        .build();
  }

  private ReturnStoreTicket mapReturnStoreTicket(StoreTicket returnStoreTicket) {
    return ReturnStoreTicket.newBuilder()
        .setTicketDate(returnStoreTicket.getTicketDate().toString())
        .setTicketNumber(returnStoreTicket.getTicketNumber())
        .setStorePublicId(returnStoreTicket.getStorePublicId())
        .setPosId(returnStoreTicket.getPosId())
        .build();
  }

  private OriginStoreTicket mapOriginStoreTicket(StoreTicket originStoreTicket) {
    OriginStoreTicket originStoreTicketRecord = new OriginStoreTicket();
    originStoreTicketRecord.setTicketDate(originStoreTicket.getTicketDate().toString());
    originStoreTicketRecord.setTicketNumber(originStoreTicket.getTicketNumber());
    originStoreTicketRecord.setStorePublicId(originStoreTicket.getStorePublicId());
    originStoreTicketRecord.setPosId(originStoreTicket.getPosId());
    return originStoreTicketRecord;
  }

}
