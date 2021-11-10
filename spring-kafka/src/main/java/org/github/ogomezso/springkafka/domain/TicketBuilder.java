package org.github.ogomezso.springkafka.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import org.github.ogomezso.springkafka.domain.model.Invoice;
import org.github.ogomezso.springkafka.domain.model.ParkedLines;
import org.github.ogomezso.springkafka.domain.model.PaymentInfo;
import org.github.ogomezso.springkafka.domain.model.PaymentMethodBankTransfer;
import org.github.ogomezso.springkafka.domain.model.PaymentMethodCash;
import org.github.ogomezso.springkafka.domain.model.PaymentMethodCoupon;
import org.github.ogomezso.springkafka.domain.model.PaymentMethodCreditCard;
import org.github.ogomezso.springkafka.domain.model.Scale;
import org.github.ogomezso.springkafka.domain.model.StoreTicket;
import org.github.ogomezso.springkafka.domain.model.Ticket;
import org.github.ogomezso.springkafka.domain.model.TicketHeader;
import org.github.ogomezso.springkafka.domain.model.TicketIdentity;
import org.github.ogomezso.springkafka.domain.model.TicketLine;
import org.github.ogomezso.springkafka.domain.model.TicketLineTax;
import org.github.ogomezso.springkafka.domain.model.TotalTax;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TicketBuilder {

  private final Faker faker = new Faker();
  private final Random random = new Random();

  public Ticket createNewTicket() {

    return Ticket.builder()
        .companyId(faker.number().digits(8))
        .header(
            TicketHeader.builder()
                .barcode(faker.number().digits(32))
                .certificationCode(faker.number().digits(32))
                .companyName(faker.company().name())
                .companyVatNumber(faker.number().digits(8))
                .deliveryNoteDate(LocalDate.now())
                .deliveryNoteNumber(faker.number().digits(8))
                .employeeId(faker.number().digits(8))
                .deliveryNotePosId(faker.number().digits(2))
                .encodedCustomerId(faker.number().digits(8))
                .invoiceDuration(faker.number().randomNumber(6, true))
                .isDigitalTicket(true)
                .isParked(faker.bool().bool())
                .locale(faker.country().countryCode2())
                .originStoreTicket(
                    StoreTicket.builder()
                        .ticketDate(LocalDate.now())
                        .ticketNumber(faker.number().digits(32))
                        .posId(faker.number().digits(4))
                        .storePublicId(faker.number().digits(8))
                        .build()
                )
                .returnStoreTicket(
                    StoreTicket.builder()
                        .storePublicId(faker.number().digits(8))
                        .posId(faker.number().digits(4))
                        .ticketNumber(faker.number().digits(32))
                        .ticketDate(LocalDate.now())
                        .build()
                )
                .paymentDuration(faker.number().randomNumber(6, true))
                .salesChannelId(faker.number().digits(2))
                .storeAddress(faker.address().streetAddress())
                .storeCity(faker.address().city())
                .storePhone(faker.phoneNumber().phoneNumber())
                .storeTypeId(faker.number().digits(8))
                .ticketHour(LocalDateTime.now())
                .ticketTypeId(faker.number().digits(2))
                .storeZipCode(faker.address().zipCode())
                .totalTicketAmount(String.valueOf(faker.number().randomDouble(2, 1, 300)))
                .teleSalesOrderNumber(faker.number().digits(8))
                .transactionTypeId(faker.number().digits(8))
                .build()
        )
        .identity(
            TicketIdentity.builder()
                .posId(faker.number().digits(8))
                .storePublicId(faker.number().digits(8))
                .ticketDate(LocalDate.now())
                .ticketNumber(faker.number().digits(32))
                .build()
        )
        .invoice(
            Invoice.builder()
                .branchOfficeId(faker.number().digits(8))
                .invoiceHandOverTypeId(faker.number().digit())
                .vatNumber(faker.number().digits(8))
                .build()
        )
        .lines(createLines())
        .parkedLines(createParkedLines())
        .paymentMethodBankTransfer(PaymentMethodBankTransfer.builder()
            .authorizedNif(faker.idNumber().valid())
            .transferPayment(createPaymentInfo())
            .build())
        .paymentMethodCash(createPaymentCash())
        .paymentMethodCoupon(createPaymentMethodCoupon())
        .paymentMethodCreditCard(createPaymentCreditCard())
        .scale(createScale())
        .totalTax(createTax())
        .build();
  }

  private List<TotalTax> createTax() {
    List<TotalTax> totalTaxes = new ArrayList<>();
    IntStream.range(0, random.nextInt(100)).forEach(index -> {
      totalTaxes.add(TotalTax.builder()
          .isTaxIncluded(faker.bool().bool())
          .taxBase(faker.number().digits(2))
          .taxCharge(String.valueOf(faker.number().randomDouble(2, 1, 300)))
          .taxClass(faker.number().digit())
          .taxRate(String.valueOf(faker.number().randomDouble(2, 0, 1)))
          .taxType(faker.number().digit())
          .vatLetter(faker.letterify("*"))
          .build());
    });
    return totalTaxes;
  }

  private List<Scale> createScale() {
    List<Scale> scales = new ArrayList<>();
    IntStream.range(0, random.nextInt(100)).forEach(index ->{
      scales.add(
          Scale.builder()
              .groupId(faker.number().digit())
              .linedNumberScale(String.valueOf(index))
              .scaleAmount(String.valueOf(faker.number().randomDouble(2, 1, 300)))
              .scaleDate(LocalDate.now().toString())
              .scaleHour(String.valueOf(LocalDateTime.now().getHour()))
              .scaleId(faker.number().digit())
              .scaleOperatorId(faker.number().digits(8))
              .scaleTicketId(faker.number().digits(8))
              .scaleTicketType(faker.number().digit())
              .build()
      );
    });
    return scales;
  }

  private List<PaymentMethodCreditCard> createPaymentCreditCard() {
    List<PaymentMethodCreditCard> paymentMethodCreditCardList = new ArrayList<>();
    IntStream.range(0, random.nextInt(100)).forEach(index -> {
      paymentMethodCreditCardList.add(
          PaymentMethodCreditCard.builder()
              .cardPayment(createPaymentInfo())
              .creditCardId(faker.business().creditCardNumber())
              .expirationDate(faker.business().creditCardExpiry())
              .introductionMethodCard(faker.number().digit())
              .isSigned(faker.bool().bool())
              .operationNumber(faker.number().digits(8))
              .pinPad(faker.number().digits(4))
              .period(faker.number().digit())
              .receipt(faker.number().digits(8))
              .token(faker.internet().uuid())
              .isCancelled(faker.bool().bool())
              .build()
      );
    });
    return paymentMethodCreditCardList;
  }

  private List<PaymentMethodCoupon> createPaymentMethodCoupon() {
    List<PaymentMethodCoupon> paymentMethodCouponList = new ArrayList<>();

    IntStream.range(0, random.nextInt(100)).forEach(index -> {
      paymentMethodCouponList.add(
          PaymentMethodCoupon.builder()
              .couponPayment(createPaymentInfo())
              .couponBarcode(faker.number().digits(32))
              .articleDescription(faker.funnyName().name())
              .articleGtin(String.valueOf(faker.number().randomDouble(2, 1, 100)))
              .couponDescription(faker.funnyName().name())
              .couponIntroducedMethod(faker.number().digits(2))
              .forced(faker.number().numberBetween(0,9))
              .build()
      );
    });
    return paymentMethodCouponList;
  }

  private List<PaymentMethodCash> createPaymentCash() {
    List<PaymentMethodCash> paymentMethodCashList = new ArrayList<>();
    IntStream.range(0, random.nextInt(100)).forEach(index -> {
      paymentMethodCashList.add(
          PaymentMethodCash.builder()
              .cashPayment(createPaymentInfo())
              .isCancelled(faker.bool().bool())
              .isPendingCash(faker.bool().bool())
              .build()
      );
    });

    return paymentMethodCashList;
  }

  private PaymentInfo createPaymentInfo() {
    return PaymentInfo.builder()
        .paymentMethodAmount(String.valueOf(faker.number().randomDouble(2, 1, 300)))
        .paymentMethodId(faker.number().digit())
        .build();
  }

  private List<ParkedLines> createParkedLines() {
    List<ParkedLines> parkedLines = new ArrayList<>();

    IntStream.range(0, random.nextInt(100)).forEach(index -> {
      parkedLines.add(
          ParkedLines.builder()
              .amountLine(String.valueOf(faker.number().randomDouble(2, 1, 300)))
              .parkedTime(LocalDateTime.now())
              .parkedType(faker.number().digit())
              .employeeId(faker.number().digits(8))
              .lineNumber(index)
              .build()
      );
    });
    return parkedLines;
  }

  private List<TicketLine> createLines() {
    List<TicketLine> lines = new ArrayList<>();
    IntStream.range(0, random.nextInt(100)).forEach(index -> {
          lines.add(
              TicketLine.builder()
                  .auxiliarBarcode(faker.number().digits(32))
                  .grossPvp(String.valueOf(faker.number().randomDouble(2, 1, 300)))
                  .gtin(String.valueOf(faker.number().randomDouble(2, 1, 100)))
                  .introductionMethod(faker.number().digit())
                  .isVatSplitted(faker.bool().bool())
                  .lineAmount(String.valueOf(faker.number().randomDouble(2, 1, 300)))
                  .lineNumber(index)
                  .productDenomination(faker.funnyName().name())
                  .productPublicId(faker.number().digits(8))
                  .pvp(String.valueOf(faker.number().randomDouble(2, 1, 300)))
                  .quantity(faker.number().numberBetween(0,9))
                  .saleTypeScale(faker.number().digit())
                  .ticketLineTax(
                      TicketLineTax.builder()
                          .isTaxIncluded(faker.bool().bool())
                          .taxBase(faker.number().digits(2))
                          .taxCharge(faker.number().digits(2))
                          .taxClass(faker.number().digit())
                          .taxRate(String.valueOf(faker.number().randomDouble(2, 0, 1)))
                          .taxType(faker.number().digit())
                          .vatLetter(faker.letterify("*"))
                          .build()
                  )
                  .typeOfLine(faker.number().digits(2))
                  .sectionId(faker.number().digits(2))
                  .typeOfTicketLine(faker.number().digits(2))
                  .transactionLineTypeId(faker.number().digits(2))
                  .unknownProductPublicId(faker.number().digit())
                  .build()
          );
        }
    );
    return lines;
  }
}