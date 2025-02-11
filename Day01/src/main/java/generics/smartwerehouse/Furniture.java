package generics.smartwarehouse;

// Represents a Furniture item in the warehouse
public class Furniture extends WareHouse {

    // Constructor to initialize the furniture item
    public Furniture(String name) {
        super(name);
    }

    // Overriding toString() to return item details
    @Override
    public String toString() {
        return "Furniture: " + getItem();
    }
}
