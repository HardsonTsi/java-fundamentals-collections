package hardtech;

import java.util.Arrays;

public class TheArrayProblem {

    public static void main(String[] args) {

        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);

//        Create
        Product[] products = {door, floorPanel};

//        Print
        System.out.println(Arrays.toString(products));

//        Add
        final Product product = new Product("Window", 3);
        products = add(product, products);
        System.out.println(Arrays.toString(products));
    }

    public static Product[] add(Product product, Product[] array) {
        int length = array.length;
        Product[] newArray = Arrays.copyOf(array, length + 1);
        newArray[length] = product;
        return newArray;
    }
}
