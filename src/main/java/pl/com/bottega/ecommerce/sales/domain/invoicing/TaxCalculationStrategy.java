package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;

public interface TaxCalculationStrategy {
    Tax calculate(Money net);
}
