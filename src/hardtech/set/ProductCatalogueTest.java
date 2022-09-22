package hardtech.set;

import org.junit.jupiter.api.Test;

import static hardtech.ProductFixtures.bobs;
import static hardtech.ProductFixtures.kates;

public class ProductCatalogueTest {

    @Test
    public void shouldOnlyHoldUniqueProducts() throws Exception {
        ProductCatalogue catalogue = new ProductCatalogue();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);
    }

}
