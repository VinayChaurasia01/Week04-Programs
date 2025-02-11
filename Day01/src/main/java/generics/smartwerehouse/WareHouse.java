package generics.smartwarehouse;

// Represents a general warehouse item
public class WareHouse {
    private String item;

    // Constructor to initialize warehouse item
    public WareHouse(String item) {
        this.item = item;
    }

    // Getter method for item name
    public String getItem() {
        return this.item;
    }

    // Overriding toString() to display item details
    @Override
    public String toString() {
        return "Item: " + item;
    }
}
