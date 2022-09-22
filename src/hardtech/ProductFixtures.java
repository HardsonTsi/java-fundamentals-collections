package hardtech;

import hardtech.set.Supplier;

public class ProductFixtures {

    public static final Product door = new Product("Wooden Door", 35);
    public static final Product floorPanel = new Product("Floor Panel", 25);
    public static final Product window = new Product("Window", 3);

    public static final Supplier bobs = new Supplier("Bob's HouseHold Supplies");
    public static final Supplier kates = new Supplier("Kate's Home Goods");

    static {
        bobs.products.add(floorPanel);
        bobs.products.add(door);

        kates.products.add(floorPanel);
        kates.products.add(door);
    }

}
