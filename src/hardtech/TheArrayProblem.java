package hardtech;

import java.util.Arrays;

public class TheArrayProblem {

    public static void main(String[] args) {

        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);

//        Create
        Product[] products = {door, floorPanel};
        System.out.println(products);
    }

    public static Product[] add(Product product, Product[] array) {
        int length = array.length;
        Product[] newArray = Arrays.copyOf(array, length + 1);
        newArray[length] = product;
        return newArray;
    }
}
