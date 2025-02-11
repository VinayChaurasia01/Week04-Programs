package generics.smartwarehouse;

import java.util.ArrayList;
import java.util.List;

// Generic storage class for warehouse items
public class Storage<T extends WareHouse> {
    private List<T> items;

    // Constructor initializes the storage list
    public Storage() {
        items = new ArrayList<>();
    }

    // Adds an item to storage
    public void add(T item) {
        items.add(item);
    }

    // Returns the list of stored items
    public List<T> get() {
        return items;
    }
}
