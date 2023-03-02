// Define a public class named MainProgram
public class MainProgram {

    // Define the main method which will run when the program starts
    public static void main(String[] args) {
        // Create a new gift object
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        
        // Create a new package object
        Package gifts = new Package();
        
        // Add the gift object to the package
        gifts.addGift(book);
        
        // Print out the total weight of all the gifts in the package
        System.out.println(gifts.totalWeight());
    }
    
}

// Define a gift class
class Gift {

    // Define two private variables to store the name and weight of the gift
    private String name;
    private int weight;
    
    // Create a constructor method that sets the name and weight of the gift
    public Gift(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    // Create a method that returns the name of the gift
    public String getName() {
        return this.name;
    }
    
    // Create a method that returns the weight of the gift
    public int getWeight() {
        return this.weight;
    }
    
    // Create a toString method that returns a string representation of the gift
    @Override
    public String toString() {
        return this.name + "(" + this.weight + " kg)";
    }
}

// Import the ArrayList class from the Java utilities library
import java.util.ArrayList;

// Define a package class
class Package {

    // Define a private ArrayList variable to store the gifts in the package
    private ArrayList<Gift> list;
    
    // Create a constructor method that initializes the list variable as an empty ArrayList
    public Package() {
        this.list = new ArrayList<>();
    }

    // Create a method that adds a gift to the package
    public void addGift(Gift gift) {
        list.add(gift);
    }
    
    // Create a method that returns the total weight of all the gifts in the package
    public int totalWeight() {
        int total = 0;
        
        // Loop through all the gifts in the list and add up their weights
        for(Gift gift : list) {
            total += gift.getWeight();
        }
        
        // Return the total weight
        return total;
    }
}
