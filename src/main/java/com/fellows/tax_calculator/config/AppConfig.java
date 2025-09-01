package com.fellows.tax_calculator.config;

import com.fellows.tax_calculator.adapter.output.ForDefaultTaxRateRepository;
import com.fellows.tax_calculator.ports.output.ForGettingTaxRates;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

  @Bean
  public ForGettingTaxRates forGettingTaxRates() {
    return new ForDefaultTaxRateRepository();
  }
}
