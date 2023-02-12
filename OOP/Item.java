import java.util.Scanner; // Import scanner
import java.util.ArrayList; // Import arraylist
import java.util.Date; // Import date

public class MainProgram { // MainProgram class

    public static void main(String[] args) { // Main method
        // Create a Scanner object for reading input from the user
        Scanner scanner = new Scanner(System.in);
        // Create an ArrayList to store the items
        ArrayList<Item> list = new ArrayList<>();

        // Prompt the user to enter the name of an item
        System.out.println("Name:");

        // Read names of items from the user
        while (true) {
            // Read the name of the item
            String name = scanner.nextLine();
            // If the name is empty, stop reading
            if (name.equals("")) {
                break;
            }
            // Create a new Item object with the given name
            Item item = new Item(name);
            // Add the Item object to the list of items
            list.add(item);
        }

        // Print all the items in the list
        for (Item item : list) {
            System.out.println(item);
        }
    } // End main method
} // End MainProgram class

class Item { // Item class
    // Name of the item
    String item_name;
    // Time of creation of the item
    String timeOfCreation;

    // Constructor for an Item
    public Item(String name) {
        // Set the name of the item
        this.item_name = name;
        // Set the time of creation of the item
        this.timeOfCreation = new Date().toString();
    } // End constructor

    // Override the toString method
    @Override
    public String toString() {
        // Return the name of the item and the time of creation as a single String
        return this.item_name + ", Created at: " + timeOfCreation;
    }
} // End Item class
