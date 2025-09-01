package com.fellows.tax_calculator.core.domain;

import java.math.BigDecimal;
import java.util.Currency;
import lombok.Builder;

@Builder
public record TaxDomain(
    String id,
    String description,
    Currency currency,
    BigDecimal value
) {

}
