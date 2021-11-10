package org.github.ogomezso.scs.domain.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class TicketLine {
  Integer lineNumber;
  String typeOfLine;
  String gtin;
  String productPublicId;
  String productDenomination;
  Integer quantity;
  String pvp;
  String sectionId;
  String lineAmount;
  String introductionMethod;
  String auxiliarBarcode;
  String unknownProductPublicId;
  String grossPvp;
  String transactionLineTypeId;
  Boolean isVatSplitted;
  String saleTypeScale;
  TicketLineTax ticketLineTax;
  String typeOfTicketLine;
}
