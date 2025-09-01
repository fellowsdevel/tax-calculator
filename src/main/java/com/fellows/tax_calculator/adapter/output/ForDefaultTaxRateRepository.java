package com.fellows.tax_calculator.adapter.output;

import com.fellows.tax_calculator.ports.output.ForGettingTaxRates;

public class ForDefaultTaxRateRepository implements ForGettingTaxRates {

  @Override
  public double taxRate() {
    return 0.15;
  }
}
