public class MainProgram {

    public static void main(String[] args) {
        // Create a new instance of ProductWarehouseWithHistory named juice with an initial capacity and quantity of 1000.0
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);

        // Reduce the quantity of juice in the warehouse by 11.3 units
        juice.takeFromWarehouse(11.3);        

        // Add 1.0 units of juice to the warehouse
        juice.addToWarehouse(1.0);        
        
        // Print the analysis of the product warehouse's history, including the initial and final amounts, the average amount, and the largest and smallest amounts
        juice.printAnalysis();
    }
}
class Warehouse {
    // instance variables for the warehouse's capacity and current balance
    private double capacity;
    private double balance = 0;
    
    // constructor that takes in a capacity value and sets it for the warehouse
    public Warehouse(double capacity) {
        // if capacity is negative or zero, set it to zero
        if (capacity <= 0) {
            this.capacity = 0;          
        }         
        this.capacity = capacity;       
    }
    
    // getter method for the current balance of the warehouse
    public double getBalance() {
        return balance;
    }
    
    // getter method for the capacity of the warehouse
    public double getCapacity() {
        return this.capacity;
    }
    
    // method that calculates how much space is left in the warehouse
    public double howMuchSpaceLeft() {
        return (this.capacity - balance);
    }
    
    // method that adds an amount to the warehouse's balance
    public void addToWarehouse(double amount) {
        // if the amount is negative, do nothing
        if (amount < 0) {
            return;
        } 
        
        // calculate the new balance after adding the amount
        double newBalance = balance + amount;
        
        // if the new balance exceeds the warehouse's capacity, set the balance to the capacity
        if (newBalance > this.capacity) {
            balance = this.capacity;
        } else {
            balance = newBalance;
        }
    }
    
    // method that subtracts an amount from the warehouse's balance
    public double takeFromWarehouse(double amount) {
        // if the amount is negative, return 0
        if (amount < 0) {
            return 0;
        } else {
            // if the amount exceeds the current balance, set the balance to 0 and return the previous balance
            if (amount > balance) {
                return balance = 0.0;
            } else {
                // otherwise, subtract the amount from the balance and return the new balance
                return balance -= amount;
            }
        }                
    }
    
    // override the toString method to print the warehouse's balance and remaining space
    @Override
    public String toString() {
        return "balance = " + balance + ", space left " + (this.capacity - balance);
    }
}
// This class represents a warehouse for a specific product, extending the Warehouse class.
class ProductWarehouse extends Warehouse{
    
    // The name of the product stored in this warehouse.
    private String productName;
    
    // Constructs a new ProductWarehouse with the specified product name and capacity.
    public ProductWarehouse(String productName, double capacity) {
        // Calls the constructor of the parent Warehouse class with the specified capacity.
        super(capacity);
        // Initializes the product name for this ProductWarehouse.
        this.productName = productName;
    }
    
    // Returns the name of the product stored in this warehouse.
    public String getName() {
        return this.productName;
    }
    
    // Sets the name of the product stored in this warehouse to the specified value.
    public String setName(String newName) {
        return this.productName = newName;
    } 
    
    // Returns a string representation of this ProductWarehouse object, which includes the name of the product and the current warehouse balance and capacity.
    @Override
    public String toString() {
        return this.productName + ": " + super.toString();
    }
}
import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory extends ProductWarehouse {

    private ArrayList<Double> history;

    public ChangeHistory(String productName, double capacity) {
        super(productName,capacity);
        this.history = new ArrayList<>();
    }

    // Adds a new value to the history list
    public void add(double status) {
        this.history.add(status);
    }

    // Clears the history list
    public void clear() {
        history.clear();
    }

    // Finds and returns the maximum value in the history list
    public double maxValue() {
        double max = 0.0;
        
        if (history.isEmpty()) {
            return 0;
        } else {
            Collections.sort(history);
            max = Collections.max(history);
        }

        return max;
    }
    
    // Finds and returns the minimum value in the history list
    public double minValue() {
        double min = 0.0;
        
        if (history.isEmpty()) {
            return 0;
        } else {
            Collections.sort(history);
            min = Collections.min(history);
        }
        
        return min;
    }
    
    // Calculates and returns the average value of the history list
    public double average() {
        double sum = 0.0;
        if (history.isEmpty()) {
            return 0;
        } else {
            for (int i = 0; i < history.size(); i++) {
                sum += history.get(i);
            }
        }
        
        return sum / history.size();
    }

    // Returns a string representation of the history list
    @Override
    public String toString() {
        return history.toString();
    }
}
// A class that extends ProductWarehouse and adds a ChangeHistory object to keep track of the balance history.
class ProductWarehouseWithHistory extends ProductWarehouse {
    
    // A ChangeHistory object to keep track of the balance history.
    private ChangeHistory history;
    
    // Constructor to create a ProductWarehouseWithHistory object.
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        // Calls the constructor of the super class, ProductWarehouse, to set the capacity and productName of the warehouse.
        super(productName, capacity);
        // Initializes a new ChangeHistory object with the same productName and capacity as the warehouse.
        this.history = new ChangeHistory(productName, capacity);
        // Adds the initial balance to the warehouse and to the history.
        addToWarehouse(initialBalance);
    }
    
    // Method to add a given amount to the warehouse balance.
    public void addToWarehouse(double amount) {
        // Check if the amount is negative. If it is, do nothing and return.
        if (amount < 0) {
            return;
        } 
        // Otherwise, add the amount to the warehouse and to the history.
        super.addToWarehouse(amount);
        history.add(getBalance());
    }
    
    // Method to take a given amount from the warehouse balance.
    public double takeFromWarehouse(double amount) {
        // Check if the amount is negative. If it is, return 0.
        if (amount < 0) {
            return 0;                    
        }
        // Otherwise, take the amount from the warehouse and add the new balance to the history.
        double taken = super.takeFromWarehouse(amount);
        history.add(getBalance());
        // Return the amount taken from the warehouse.
        return taken;
    }
    
    // Method to get the history of the warehouse balance.
    public String history() {
        return history.toString();
    }
    
    // Method to print an analysis of the warehouse history.
    public void printAnalysis() {
        // Print the name of the product.
        System.out.println("Product: " + super.getName());
        // Print the history of the warehouse balance.
        System.out.println("History: " + history.toString());
        // Print the largest amount of product in the history.
        System.out.println("Largest amount of product: " + history.maxValue());
        // Print the smallest amount of product in the history.
        System.out.println("Smallest amount of product: " + history.minValue());
        // Print the average amount of product in the history.
        System.out.println("Average: " + history.average());
    }
}
