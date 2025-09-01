package com.fellows.tax_calculator.ports.input;

import com.fellows.tax_calculator.core.domain.TaxDomain;
import java.math.BigDecimal;

public interface ForCalculatingTaxes {

  BigDecimal taxOn(TaxDomain taxDomain);
}
