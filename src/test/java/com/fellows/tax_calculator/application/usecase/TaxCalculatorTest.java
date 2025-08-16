package com.fellows.tax_calculator.application.usecase;

import com.fellows.tax_calculator.adapter.output.ForDefaultTaxRateRepository;
import com.fellows.tax_calculator.application.ports.input.ForCalculatingTaxes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TaxCalculatorTest {

  @Test
  void taxOn() {

    ForCalculatingTaxes forCalculatingTaxes = new TaxCalculator(new ForDefaultTaxRateRepository());
    double taxValue = forCalculatingTaxes.taxOn(100);
    Assertions.assertEquals(15.0, taxValue);
  }

}
