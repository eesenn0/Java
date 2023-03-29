public class MainProgram {

    public static void main(String[] args) {
        // Create a new MisplacingBox object
        MisplacingBox box = new MisplacingBox();
        
        // Add two new Item objects to the box
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));
         
        // Check if the item "Saludo" and "Pirkka" are in the box
        System.out.println(box.isInBox(new Item("Saludo", 5)));
        System.out.println(box.isInBox(new Item("Pirkka", 5)));
    }
    
}

import java.util.ArrayList;

// Create an abstract class Box
abstract class Box {
    
    // Define an abstract method called "add" that takes an Item object as input
    public abstract void add(Item item);         
    
    // Define a method called "add" that takes an ArrayList of Item objects as input
    public void add(ArrayList<Item> items) {
        // Loop through each item in the ArrayList and add it to the box using the abstract "add" method
        for (Item item : items) {
            Box.this.add(item);
        }
    }
}

// Create a class called Item
class Item {
    protected String name;
    protected int weight;
    
    // Create a constructor that takes a name and weight as inputs
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    // Override the equals method to check if two Item objects are equal
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (!(obj instanceof Item)) {
            return false;
        }
        
        Item item = (Item) obj;
        
        if (this.name.equals(item.name) && this.weight == item.weight) {
            return true;
        }
        
        return false;
    }
    
    // Override the hashCode method to create a unique hash code for each Item object
    @Override
    public int hashCode() {
        int result = 17;
        
        result = 31 * result + name.hashCode();
        
        return result;
    }
}
// Importing necessary libraries
import java.util.ArrayList;

// Definition of a subclass BoxWithMaxWeight that inherits from Box class
class BoxWithMaxWeight extends Box {

    // Declaring private instance variables capacity and list
    private int capacity;
    private ArrayList<Item> list;

    // Constructor method for BoxWithMaxWeight class
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.list = new ArrayList<>();
    }

    // Method that checks if a given item is in the box
    public boolean isInBox(Item item) {
        // Iterating through the items in the box
        for (Item currentItem : list) {
            // If an item matches the given item, return true
            if (currentItem.equals(item)) {
                return true;
            }
        }
        // Otherwise, return false
        return false;
    }
    
    // Override of the add method from the Box class
    @Override
    public void add(Item item) {
        // Initializing totalWeight variable
        int totalWeight = 0;
        // Iterating through the items in the box
        for (Item currentItem : list) {
            // Incrementing totalWeight by the weight of each item
            totalWeight += currentItem.weight;
        }
        
        // If the weight of the new item plus the total weight of the box is less than or equal to the capacity of the box, add the item to the list
        if (totalWeight + item.weight <= capacity) {
            list.add(item);
        }
    }
    
    // Override of the add method from the Box class that takes an ArrayList of items as input
    @Override
    public void add(ArrayList<Item> items) {
        // Iterating through each item in the ArrayList
        for (Item item : items) {
            // Adding each item to the box using the add method from the BoxWithMaxWeight class
            add(item);
        }
    }
}

// Definition of a subclass OneItemBox that inherits from Box class
class OneItemBox extends Box {
    // Declaring private instance variable list
    private ArrayList<Item> list;
    
    // Constructor method for OneItemBox class
    public OneItemBox() {
        // Initializing list as an empty ArrayList
        this.list = new ArrayList<>();
    }
    
    // Override of the add method from the Box class
    @Override
    public void add(Item item) {
        // If the list is empty or null, add the item to the list
        if (list.isEmpty() || list == null) {
           list.add(item);
        } else {
            // Otherwise, return without adding the item
            return;
        }
    }
    
    // Method that checks if a given item is in the box
    public boolean isInBox(Item item) {
        // Iterating through the items in the box
        for (Item currentItem : list) {
            // If an item matches the given item, return true
            if (currentItem.equals(item)) {
                return true;
            }
        }
        // Otherwise, return false
        return false;
    }
}

// Definition of a subclass MisplacingBox that inherits from Box class
class MisplacingBox extends Box {
    
    // Constructor method for MisplacingBox class
    public MisplacingBox() {
    }
    
    // Override of the add method from the Box class
    @Override
    public void add(Item item) {
        // Method doesn't add any items to the box
    }
    
    // Method that checks if a given item is in the box (always returns false)
    public boolean isInBox(Item item) {
        return false;
    }
