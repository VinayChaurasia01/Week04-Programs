package generics.onlinemarketplace;

// Main Marketplace Simulation Class
public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        // Creating Products
        Product<Book> book = new Product<>("Java Fundamentals", 39.99, new Book("Programming"));
        Product<Clothing> trouser = new Product<>("Formal Trouser", 35.0, new Clothing("Formal", "30"));
        Product<Gadgets> gadget = new Product<>("Pixel 8", 1200.0, new Gadgets("Google", "Mobile"));

        // Adding products to catalog
        catalog.addProduct(book);
        catalog.addProduct(trouser);
        catalog.addProduct(gadget);

        // Displaying product list before applying discount
        System.out.println("\n🛒 Before Discount:");
        catalog.displayProducts();

        // Applying discounts
        Catalog.applyDiscount(book, 15);
        Catalog.applyDiscount(trouser, 20);
        Catalog.applyDiscount(gadget, 10);

        // Displaying product list after discount
        System.out.println("\n💰 After Discount:");
        catalog.displayProducts();
    }
}
