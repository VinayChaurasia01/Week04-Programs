package generics.smartwarehouse;

import java.util.List;

// Smart warehouse management system to handle storage and retrieval
public class SmartWareHouseManagementSystem {

    // Displays all items in a given storage
    public static void displayItems(List<? extends WareHouse> items) {
        for (WareHouse item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // Creating different types of items
        Electronics phone = new Electronics("SmartPhone");
        Groceries sugar = new Groceries("Sugar");
        Furniture chair = new Furniture("Chair");

        // Creating storage units for different item categories
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Adding items to their respective storage
        electronicsStorage.add(phone);
        groceriesStorage.add(sugar);
        furnitureStorage.add(chair);

        // Display stored items
        System.out.println("Electronics Storage:");
        displayItems(electronicsStorage.get());

        System.out.println("\nGroceries Storage:");
        displayItems(groceriesStorage.get());

        System.out.println("\nFurniture Storage:");
        displayItems(furnitureStorage.get());
    }
}
