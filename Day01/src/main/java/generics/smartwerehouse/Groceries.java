package generics.smartwerehouse;

// Represents a Groceries item in the warehouse
public class Groceries extends WareHouse {

    // Constructor to initialize the grocery item
    public Groceries(String name) {
        super(name);
    }

    // Overriding toString() to return item details
    @Override
    public String toString() {
        return "Groceries: " + getItem();
    }
}
