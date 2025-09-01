package com.fellows.tax_calculator.core.usecase;

import com.fellows.tax_calculator.core.domain.TaxDomain;
import com.fellows.tax_calculator.ports.input.ForCalculatingTaxes;
import com.fellows.tax_calculator.ports.output.ForGettingTaxRates;
import java.math.BigDecimal;

public class TaxCalculator implements ForCalculatingTaxes {

  private final ForGettingTaxRates taxRates;

  public TaxCalculator(ForGettingTaxRates taxRates) {
    this.taxRates = taxRates;
  }

  @Override
  public BigDecimal taxOn(TaxDomain amount) {
    return amount.value().multiply(BigDecimal.valueOf(taxRates.taxRate()));
  }
}
