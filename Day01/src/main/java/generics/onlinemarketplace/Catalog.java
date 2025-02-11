package generics.onlinemarketplace;

import java.util.*;

// Product Catalog to manage marketplace products
public class Catalog {
    private List<Product<?>> productList = new ArrayList<>();

    // Add product to catalog
    public void addProduct(Product<?> product) {
        productList.add(product);
    }

    // Get list of all products
    public List<Product<?>> getProducts() {
        return productList;
    }

    // Generic method to apply discount to any product
    public static <T extends Product<?>> void applyDiscount(T product, double discountPercentage) {
        System.out.println("Updating price for: " + product.getName());
        double discount = (product.getPrice() * discountPercentage) / 100;
        product.setPrice(product.getPrice() - discount);
        System.out.println("Price updated successfully!\n");
    }

    // Display all products
    public void displayProducts() {
        for (Product<?> product : productList) {
            System.out.println(product + "\n----------------------------");
        }
    }
}
