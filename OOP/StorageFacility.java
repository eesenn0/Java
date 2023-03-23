public static void main(String[] args) {
    // Create a new StorageFacility object
    StorageFacility facility = new StorageFacility();

    // Add some items to the storage units
    facility.add("a14", "ice skates");
    facility.add("a14", "ice hockey stick");
    facility.add("a14", "ice skates");

    facility.add("f156", "rollerblades");
    facility.add("f156", "rollerblades");

    facility.add("g63", "six");
    facility.add("g63", "pi");

    // Remove an item from a storage unit
    facility.remove("f156", "rollerblades");

    // Print the contents of a storage unit
    System.out.println(facility.contents("f156"));

    // Print the list of storage units
    System.out.println(facility.storageUnits());
}
import java.util.ArrayList;
import java.util.HashMap;

class StorageFacility {

    // A HashMap to store storage units and their contents
    private HashMap<String, ArrayList<String>> storage;

    // Constructor to initialize the HashMap
    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    // Method to add an item to a storage unit
    public void add(String unit, String item) {
        // If the storage unit doesn't exist in the HashMap, add it with an empty ArrayList
        this.storage.putIfAbsent(unit, new ArrayList<>());
        // Get the ArrayList of items for the storage unit
        ArrayList<String> storage = this.storage.get(unit);
        // Add the new item to the ArrayList
        storage.add(item);
    }

    // Method to get the contents of a storage unit
    public ArrayList<String> contents(String storageUnit) {
        // Check if the storage unit exists in the HashMap
        if (this.storage.containsKey(storageUnit)) {
            // Return the ArrayList of items for the storage unit
            return storage.get(storageUnit);
        }
        // If the storage unit doesn't exist, return null
        return null;
    }

    // Method to remove an item from a storage unit
    public void remove(String storageUnit, String item) {
        // Get the ArrayList of items for the storage unit
        this.storage.get(storageUnit).remove(item);
    }

    // Method to get a list of storage units that have at least one item
    public ArrayList<String> storageUnits() {
        // Initialize an empty ArrayList to store the storage units with items
        ArrayList<String> unitsList = new ArrayList<>();
        // If the HashMap is not empty
        if (!storage.isEmpty()) {
            // Loop through the HashMap
            for (String unit : storage.keySet()) {
                // If the ArrayList of items for the storage unit is not empty
                if (!storage.get(unit).isEmpty()) {
                    // Add the storage unit to the ArrayList of storage units with items
                    unitsList.add(unit);
                }
            }
            // Return the ArrayList of storage units with items
            return unitsList;
        }
        // If the HashMap is empty, return null
        return null;
    }

}
