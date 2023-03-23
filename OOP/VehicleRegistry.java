// Import necessary Java classes for the program to run.
import java.util.ArrayList;
import java.util.HashMap;

public class MainProgram {

    public static void main(String[] args) {
        
        // Create three LicensePlate objects, each with a different country and license plate number.
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");
        
        // Create an ArrayList to store Finnish license plates and add the first two Finnish license plates to it.
        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);
        
        // Create a new Finnish license plate object and add it to the ArrayList only if it is not already in the list.
        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if(!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        
        // Print out the Finnish license plates stored in the ArrayList.
        System.out.println("finnish: " + finnishPlates);
        
        // Create a HashMap to store owners of license plates, and add two license plates and their owners to the HashMap.
        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");
        
        // Print out the owners of the specified license plates using the get method of the HashMap.
        System.out.println("Owners:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
    }
    
}
// This is a class definition for a LicensePlate object.

class LicensePlate {

    // These instance variables have been defined as final, meaning they cannot be changed once set.
    // The country and liNumber fields store the country and license plate number respectively.
    private final String country;
    private final String liNumber;

    // This is the constructor for the LicensePlate class.
    // It takes in a country and license plate number as parameters and sets the corresponding instance variables.
    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    // This is an overridden method that returns a string representation of the LicensePlate object.
    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    // This is an overridden method that checks whether two LicensePlate objects are equal.
    // It returns true if they are equal, and false otherwise.
    @Override
    public boolean equals(Object comparedObject) {
        // If the two objects are the same instance, return true.
        if (this == comparedObject) {
            return true;
        }

        // If the compared object is not a LicensePlate object, return false.
        if (!(comparedObject instanceof LicensePlate)) {
            return false;
        }

        // Cast the compared object to a LicensePlate object.
        LicensePlate comparedPlate = (LicensePlate) comparedObject;

        // If the country and license plate number of the two LicensePlate objects are the same, return true.
        if (this.country.equals(comparedPlate.country)
                && this.liNumber.equals(comparedPlate.liNumber)) {
            return true;
        }

        // Otherwise, return false.
        return false;
    }

    // This is an overridden method that returns a hash code for the LicensePlate object.
    @Override
    public int hashCode() {
        // Initialize the result to 17.
        int result = 17;

        // Multiply the result by 31 and add the hash codes of the country and license plate number.
        result = 31 * result + country.hashCode();
        result = 31 * result + liNumber.hashCode();
        
        // Return the final result.
        return result;
    }

}
// This is a class definition for a VehicleRegistry object.

import java.util.HashMap;

class VehicleRegistry {

    // This is a HashMap that stores LicensePlate objects as keys and their corresponding owner as values.
    HashMap<LicensePlate, String> hashmap = new HashMap<>();

    // This method adds a LicensePlate and its corresponding owner to the HashMap.
    // It returns true if the LicensePlate was successfully added, and false otherwise.
    public boolean add(LicensePlate licensePlate, String owner) {
        // If the HashMap does not already contain the LicensePlate, add it and its owner and return true.
        if (!hashmap.containsKey(licensePlate)) {
            hashmap.put(licensePlate, owner);
            return true;
        }

        // Otherwise, return false.
        return false;
    }

    // This method returns the owner of a given LicensePlate.
    // If the owner is not found or is empty, it returns null.
    public String get(LicensePlate licensePlate) {
        String owner = hashmap.get(licensePlate);
        if (owner != null && !owner.isEmpty()) {
            return owner;
        }

        return null;
    }

    // This method removes a LicensePlate and its corresponding owner from the HashMap.
    // It returns true if the LicensePlate was successfully removed, and false otherwise.
    public boolean remove(LicensePlate licensePlate) {
        // If the HashMap contains the LicensePlate, remove it and return true.
        if (hashmap.containsKey(licensePlate)) {
            hashmap.remove(licensePlate);
            return true;
        }

        // Otherwise, return false.
        return false;
    }

    // This method prints the LicensePlates in the HashMap.
    public void printLicensePlates() {
        // Iterate through the HashMap and print each LicensePlate.
        for (HashMap.Entry<LicensePlate, String> entry : hashmap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    // This method prints the owners in the HashMap.
    public void printOwners() {
        // Iterate through the HashMap and print each owner.
        for (HashMap.Entry<LicensePlate, String> entry : hashmap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
