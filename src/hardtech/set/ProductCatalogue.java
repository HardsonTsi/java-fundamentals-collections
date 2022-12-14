package hardtech.set;

import hardtech.Product;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class ProductCatalogue implements Iterable<Product> {


    private final Set<Product> products = new TreeSet<>(Product.BY_WEIGHT);

    public void isSuppliedBy(Supplier supplier) {
        products.addAll(supplier.products);
    }


    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

}
