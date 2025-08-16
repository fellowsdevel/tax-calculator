package com.fellows.tax_calculator.config;

import com.fellows.tax_calculator.application.ports.output.ForGettingTaxRates;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppConfigTest {

  @Test
  void forGettingTaxRates() {
    AppConfig config = new AppConfig();
    ForGettingTaxRates forGettingTaxRates = config.forGettingTaxRates();
    Assertions.assertNotNull(forGettingTaxRates);
  }
}