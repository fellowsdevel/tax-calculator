package com.fellows.tax_calculator.core.usecase;

import com.fellows.tax_calculator.adapter.output.ForDefaultTaxRateRepository;
import com.fellows.tax_calculator.core.domain.TaxDomain;
import com.fellows.tax_calculator.ports.input.ForCalculatingTaxes;
import java.math.BigDecimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TaxCalculatorTest {

  @Test
  void taxOn() {

    ForCalculatingTaxes forCalculatingTaxes = new TaxCalculator(new ForDefaultTaxRateRepository());
    BigDecimal taxValue = forCalculatingTaxes.taxOn(TaxDomain.builder().value(BigDecimal.valueOf(15.0)).build());
    Assertions.assertEquals(BigDecimal.valueOf(2.25).doubleValue(), taxValue.doubleValue());
  }

}
