package com.fellows.tax_calculator.application.ports.output;

import com.fellows.tax_calculator.adapter.output.ForDefaultTaxRateRepository;
import com.fellows.tax_calculator.ports.output.ForGettingTaxRates;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ForGettingTaxRatesTest {

  @Test
  void taxRate() {
    ForGettingTaxRates forGettingTaxRates = new ForDefaultTaxRateRepository();
    Assertions.assertEquals(0.15, forGettingTaxRates.taxRate());
  }
}