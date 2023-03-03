public class MainProgram {
    
    // The main method is the entry point of the program
    public static void main(String[] args) {
        // Create three items with different names and weights
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3310", 1);
        Item brick = new Item("Brick", 4);

        // Create a suitcase for Ada and add two items to it
        SuitCase adasCase = new SuitCase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        // Create a suitcase for Pekka and add one item to it
        SuitCase pekkasCase = new SuitCase(10);
        pekkasCase.addItem(brick);

        // Create a hold with a maximum weight limit
        Hold hold = new Hold(1000);
        // Add both Ada and Pekka's suitcases to the hold
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        // Print out the items in the hold
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }
}

// The Item class represents an item with a name and weight
class Item {
    private String name;
    private int weight; // weight of the ITEM
    
    // Constructor to create a new item with a name and weight
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    // Getter method for the item's name
    public String getName() {
        return this.name;
    }
    
    // Getter method for the item's weight
    public int getWeight() {
        return this.weight;
    }
    
    // Override the toString() method to return a string representation of the item
    @Override
    public String toString() {
        return this.name + "(" + this.weight + " kg)";
    }
}

// Define the SuitCase class
class SuitCase {

    // Declare private variables for the maximum weight and items in the suitcase
    private int maxWeight;
    private ArrayList<Item> items;

    // Constructor for the SuitCase class
    public SuitCase(int maxWeight) {
        // Set the maximum weight
        this.maxWeight = maxWeight;
        // Initialize the items array list
        this.items = new ArrayList<>();
    }

    // Method for adding an item to the suitcase
    public void addItem(Item item) {
        // Add the item to the items array list
        items.add(item);
    }
    
    // Method for printing the items in the suitcase
    public void printItems() {
        // Loop through each item in the items array list
        for(Item item : items) {
            // Print out the item's string representation using its toString method
            System.out.println(item.toString());
        }
    }
    
    // Method for calculating the total weight of the items in the suitcase
    public int totalWeight() {
        // Initialize a variable to keep track of the total weight
        int totalWeight = 0;
        // Loop through each item in the items array list
        for(Item item : items) {
            // Add the item's weight to the total weight
            totalWeight += item.getWeight();
        }
        // Return the total weight
        return totalWeight;
    }
    
    // Method for finding the heaviest item in the suitcase
    public Item heaviestItem() {
        // If there are no items in the suitcase, return null
        if(items.isEmpty()) {
            return null;
        }
        
        // Initialize a variable to store the heaviest item so far (the first item in the list)
        Item returnObject = items.get(0);
        
        // Loop through each item in the items array list
        for(Item item : items) {
            // If the item's weight is greater than the weight of the current heaviest item,
            // update the heaviest item to be the current item
            if(item.getWeight() > returnObject.getWeight()) {
                returnObject = item;
            }
        }
        
        // Return the heaviest item
        return returnObject;
    }

    // Override the toString method to return a string representation of the suitcase
    @Override
    public String toString() {
        // Initialize a variable to keep track of the current weight of the items being added to the string
        int currentWeight = 0;
        
        // Loop through each item in the items array list
        for (Item item : items) {
            // If adding the weight of the current item to the current weight would cause the weight limit to be exceeded,
            // break out of the loop
            if(currentWeight + item.getWeight() > this.maxWeight) {
                break;
            } else {
                // Otherwise, add the weight of the current item to the current weight
                currentWeight += item.getWeight();
            }            
        }
        
        // If there are no items in the suitcase, return a string indicating that there are no items and the weight is 0 kg
        if(items.isEmpty()) {
            return "no items (0kg)";
        }
        // Otherwise, return a string indicating the number of items and their total weight
        return items.size() + " items (" + currentWeight + " kg)";
    }
}

public class Hold {
    private int maxWeight; // the maximum weight allowed for the hold
    private ArrayList<SuitCase> luggage; // list of suitcases in the hold
    
    public Hold(int maxWeight) { // constructor for creating a Hold object
        this.maxWeight = maxWeight;
        this.luggage = new ArrayList<>(); // initialize luggage as an empty ArrayList
    }
    
    public void addSuitcase(SuitCase suitcase) { // method for adding a suitcase to the hold
        luggage.add(suitcase);
    }
    
    public void printItems() { // method for printing all items in all suitcases in the hold
        for(SuitCase suitcase : luggage) { // loop through each suitcase in luggage
            suitcase.printItems(); // call the printItems() method of the suitcase
        }
    }
    
    @Override
    public String toString() { // method for creating a string representation of the Hold object
        int currentWeight = 0; // initialize currentWeight as 0
        
        for(SuitCase suitcase : luggage) { // loop through each suitcase in luggage
            if(currentWeight + suitcase.totalWeight() > this.maxWeight) { // if adding the weight of this suitcase would exceed the maximum weight
                break; // stop the loop
            } else {
                currentWeight += suitcase.totalWeight(); // add the weight of this suitcase to the current weight
            }
        }
        
        return luggage.size() + " suitcases (" + currentWeight + " kg)"; // return a string representation of the hold, showing the number of suitcases and their total weight
    }
}
