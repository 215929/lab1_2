package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

public class TaxCalculationStandard implements TaxCalculationStrategy {
    @Override
    public Tax calculate(Money net) {
        BigDecimal ratio = BigDecimal.valueOf(0.23);
        String desc = "23%";

        Money taxValue = net.multiplyBy(ratio);

        return new Tax(taxValue, desc);
    }
}
