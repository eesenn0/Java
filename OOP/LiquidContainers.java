import java.util.Scanner;

public class Main {

    public static void main(String[] args) {        
        // create a Scanner object to read input from user
        Scanner scanner = new Scanner(System.in); 
        // create a UserInterface object and pass the Scanner object to its constructor
        UserInterface ui = new UserInterface(scanner); 
        
        ui.start(); // start the user interface
    }
    
}

class UserInterface {

    private Scanner scanner;
    private LiquidContainers liquidContainers;
    
    // constructor that takes a Scanner object as a parameter
    public UserInterface(Scanner scanner) { 
        // assign the Scanner object to the instance variable
        this.scanner = scanner; 
        // create a new LiquidContainers object
        this.liquidContainers = new LiquidContainers(); 
    }

    public void start() { // method that starts the user interface
        while (true) { // infinite loop
            // print the first liquid container
            System.out.println(liquidContainers.getFirst().toString()); 
            // print the second liquid container
            System.out.println(liquidContainers.getSecond().toString()); 

            String input = scanner.nextLine(); // read the user's input
            String parts[] = input.split(" "); // split the input into an array of strings

            String command = parts[0]; // get the first element of the array (the command)

            if (command.equals("add") && parts.length == 2) { 
                int amount = Integer.parseInt(parts[1]); 
                // add the specified amount to the liquid containers
                liquidContainers.add(amount); 
                System.out.println(); // print an empty line
            } else if (command.equals("move") && parts.length == 2) { 
                int amount = Integer.parseInt(parts[1]); 
                // move the specified amount of liquid from the first container to the second container
                liquidContainers.move(amount); 
                System.out.println(); // print an empty line
            } else if (command.equals("remove") && parts.length == 2) { 
                int amount = Integer.parseInt(parts[1]); 
                // remove the specified amount of liquid from the containers
                liquidContainers.remove(amount); 
                System.out.println(); // print an empty line
            } else if (command.equals("quit")) { // if the command is "quit"
                break; // exit the while loop
            }
        }
    }

}
class LiquidContainers {

    private int limit; 
    private First first; // object representing the first container
    private Second second; // object representing the second container

    public LiquidContainers() {
        this.first = new First(0); // initialize the first container with 0 liquid
        this.second = new Second(0); // initialize the second container with 0 liquid
        this.limit = 100; // set the maximum amount of liquid that can be stored in each container to 100
    }

    public void add(int amount) {
        if (amount < 0) {
            return; // if the amount is negative, do nothing
        }
        
        // calculate the total amount of liquid in the first container after adding the specified amount
        int total = this.first.getAmount() + amount; 
        if (total <= this.limit) { // if the total amount is less than or equal to the limit
            // set the amount of liquid in the first container to the total amount
            this.first.setAmount(total); 
        } else { // if the total amount is greater than the limit
            // set the amount of liquid in the first container to the limit
            this.first.setAmount(this.limit); 
        }
    }

    public void move(int amount) {
        if (amount < 0) {
            return; // if the amount is negative, do nothing
        }
        
        // if the first container has enough liquid to move the specified amount to the second container
        if (this.first.getAmount() >= amount) { 
            // calculate the total amount of liquid in the first container after moving the specified amount
            int totalFirst = this.first.getAmount() - amount; 
            // calculate the total amount of liquid in the second container after moving the specified amount
            int totalSecond = this.second.getAmount() + amount; 
             // if the total amount of liquid in the second container is less than or equal to the limit
            if (totalSecond <= this.limit) {
                // set the amount of liquid in the first container to the total amount after moving
                this.first.setAmount(totalFirst); 
                // set the amount of liquid in the second container to the total amount after moving
                this.second.setAmount(totalSecond); 
            } else { // if the total amount of liquid in the second container is greater than the limit
                // set the amount of liquid in the first container to the total amount after moving
                this.first.setAmount(totalFirst); 
                // set the amount of liquid in the second container to the limit
                this.second.setAmount(this.limit); 
            }
        } else { // if the first container does not have enough liquid to move the specified amount to the second container
            // calculate the total amount of liquid in the second container after moving all the liquid in the first container
            int totalSecond = this.second.getAmount() + this.first.getAmount(); 
            if (totalSecond <= this.limit) { // if the total amount of liquid in the second container is less than or equal to the limit
                // set the amount of liquid in the second container to the total amount after moving
                this.second.setAmount(totalSecond); 
                // set the amount of liquid in the first container to 0
                this.first.setAmount(0); 
            } else { // if the total amount of liquid in the second container is greater than the limit
                // set the amount of liquid in the second container to the limit
                this.second.setAmount(this.limit); 
                // set the amount of liquid in the first container to the remaining amount after filling the second container to the limit
                this.first.setAmount(totalSecond - this.limit); 
            }
        }
    }
class First {
    private int limit;
    private int amount;
    
    public First(int amount) {
        this.limit = 100;  // Set the maximum limit for this container to 100
        this.amount = amount;  // Set the initial amount of liquid in the container
    }
    
    public int getAmount() {
        return this.amount;  // Returns the current amount of liquid in the container
    }
    
    public void setAmount(int amount) {
        this.amount = amount;  // Updates the amount of liquid in the container
    }
    
    public String toString() {
        // Returns a string representation of the container
        return "First: " + this.amount + "/" + this.limit;  
    }
}

class Second {
    private int limit;
    private int amount;
    
    public Second(int amount) {
        this.limit = 100;  // Set the maximum limit for this container to 100
        this.amount = amount;  // Set the initial amount of liquid in the container
    }
    
    public int getAmount() {
        return this.amount;  // Returns the current amount of liquid in the container
    }
    
    public void setAmount(int amount) {
        this.amount = amount;  // Updates the amount of liquid in the container
    }
    
    public String toString() {
        return "Second: " + this.amount + "/" + this.limit;  // Returns a string representation of the container
    }
}

   
