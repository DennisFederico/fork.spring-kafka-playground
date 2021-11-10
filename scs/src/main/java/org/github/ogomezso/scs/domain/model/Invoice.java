package org.github.ogomezso.scs.domain.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Invoice {
  String invoiceHandOverTypeId;
  String vatNumber;
  String branchOfficeId;
}
