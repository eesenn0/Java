public class MainProgram {

    public static void main(String[] args) {
        // Create a new instance of the Hideout class
        Hideout<String> den = new Hideout<>();
        
        // Check if the hideout is empty (should be true at this point)
        System.out.println(den.isInHideout());
        
        // Put a string into the hideout
        den.putIntoHideout("peekaboo");
        
        // Check if the hideout is now not empty (should be true)
        System.out.println(den.isInHideout());
        
        // Take the string out of the hideout and print it
        System.out.println(den.takeFromHideout());
        
        // Check if the hideout is now empty (should be false)
        System.out.println(den.isInHideout());
        
        // Put two more strings into the hideout
        den.putIntoHideout("toodaloo");
        den.putIntoHideout("heelloo");
        
        // Check if the hideout is not empty (should be true)
        System.out.println(den.isInHideout());
        
        // Take the first string out of the hideout and print it
        System.out.println(den.takeFromHideout());
        
        // Check if the hideout is now not empty (should be true)
        System.out.println(den.isInHideout());
    }
}

import java.util.ArrayList;
import java.util.List;

public class Hideout <T> {
    
    // Define a list to hold the object to hide
    public List<T> list;
    
    // Constructor to create an empty list
    public Hideout() {
        this.list = new ArrayList<>();
    }
    
    // Method to put an object into the hideout
    public void putIntoHideout(T toHide) {
        // Clear the list to remove any existing objects
        list.clear();
        // Add the object to hide into the list
        list.add(toHide);
    }
    
    // Method to take an object out of the hideout
    public T takeFromHideout() {
        // Get the object to take out of the list
        T fromHideout = list.get(0);
        // Clear the list to remove the object
        list.clear();
        // Return the object that was removed
        return fromHideout;
    }
    
    // Method to check if the hideout is currently holding an object
    public boolean isInHideout() {
        // If the list is empty, the hideout is empty
        if (list.isEmpty()) {
            return false;
        }
        // Otherwise, the hideout has an object in it
        return true;
    }
}
