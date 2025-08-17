package com.fellows.tax_calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaxCalculatorApplicationTests {

  @Autowired
  TaxCalculatorApplication application;

  @Test
  void contextLoads() {
    Assertions.assertDoesNotThrow(() -> TaxCalculatorApplication.main(new String[]{}));
  }

}
