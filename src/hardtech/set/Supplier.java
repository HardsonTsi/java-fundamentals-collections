package hardtech.set;

import hardtech.Product;

import java.util.HashSet;
import java.util.Set;

public class Supplier {

    private final String name;
    public Set<Product> products = new HashSet<>();

    public Supplier(String name) {
        this.name = name;
    }
}
