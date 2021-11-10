package org.github.ogomezso.scs.domain.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class TicketHeader {
  Long invoiceDuration;
  Long paymentDuration;
  String employeeId;
  LocalDateTime ticketHour;
  String totalTicketAmount;
  String ticketTypeId;
  StoreTicket originStoreTicket;
  StoreTicket returnStoreTicket;
  String deliveryNotePosId;
  String deliveryNoteNumber;
  LocalDate deliveryNoteDate;
  String teleSalesOrderNumber;
  Boolean isParked;
  String transactionTypeId;
  String salesChannelId;
  String storeTypeId;
  String storeAddress;
  String storeZipCode;
  String storeCity;
  String storePhone;
  String barcode;
  String certificationCode;
  Boolean isDigitalTicket;
  String companyName;
  String companyVatNumber;
  String locale;
  String encodedCustomerId;
}
