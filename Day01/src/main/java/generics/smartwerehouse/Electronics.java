package generics.smartwerehouse;

// Represents an Electronics item in the warehouse
public class Electronics extends WareHouse {

    // Constructor to initialize the electronics item
    public Electronics(String name) {
        super(name);
    }

    // Overriding toString() to return item details
    @Override
    public String toString() {
        return "Electronic: " + getItem();
    }
}