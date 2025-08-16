package com.fellows.tax_calculator.application.usecase;

import com.fellows.tax_calculator.application.ports.input.ForCalculatingTaxes;
import com.fellows.tax_calculator.application.ports.output.ForGettingTaxRates;

public class TaxCalculator implements ForCalculatingTaxes {

  private final ForGettingTaxRates taxRates;

  public TaxCalculator(ForGettingTaxRates taxRates) {
    this.taxRates = taxRates;
  }

  @Override
  public double taxOn(double amount) {
    return amount * taxRates.taxRate();
  }
}
