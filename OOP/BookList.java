import java.util.Scanner;
import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        // Creates a scanner object for user input
        Scanner scanner = new Scanner(System.in); 
        // Creates an ArrayList to store the books entered by the user
        ArrayList<Books> list = new ArrayList<>(); 
        
        // Initializes a variable to keep track of the number of books added
        int count = 0; 

        while (true) { // Loop continues until a break statement is executed
            // Prompts the user to enter the name of a book
            System.out.println("Name (empty will stop):"); 
            String name = scanner.nextLine(); // Reads user input as a string

            if (name.isEmpty()) { // If user input is empty, break out of the loop
                break;
            }
          
            // Prompts the user to enter the publication year of the book
            System.out.println("Publication year:"); 
            int year = Integer.parseInt(scanner.nextLine()); // Reads user input as an integer

            // Creates a new Books object with the given name and year
            Books book = new Books(name, year); 

            // Initializes a variable to keep track of whether the book is already in the ArrayList
            boolean bookExists = false; 
          
            // Loop through the ArrayList to check if the book already exists
            for (Books b : list) { 
                // Uses the equals() method in the Books class to check if the book already exists
                if (b.equals(book)) { 
                    bookExists = true; // If the book already exists, set bookExists to true
                    System.out.println("The book is already on the list."); 
                    System.out.println("Let's not add the same book again."); 
                    break; // Break out of the loop
                }
            }

            if (!bookExists) { // If the book is not in the ArrayList, add it
                list.add(book);
                count++; // Increment the count of books added
            }
        }
  
        // Prints the total number of books added to the list
        System.out.println("Thank you! Books added: " + count); 
    }
}

class Books {
    private String name; // Stores the name of the book
    private int year; // Stores the publication year of the book

    public Books(String name, int year) { // Constructor for the Books class
        this.name = name;
        this.year = year;
    }

    public String getName() { // Getter method for the name of the book
        return this.name;
    }

    public int getYear() { // Getter method for the publication year of the book
        return this.year;
    }

    public boolean equals(Object compared) { // Method to check if two Books objects are equal
        // If the two objects are the same object in memory, they are equal
        if (this == compared) { 
            return true;
        }

        // If the compared object is not an instance of the Books class, they are not equal
        if (!(compared instanceof Books)) { 
            return false;
        }

        Books compBook = (Books) compared; // Cast the compared object as a Books object

        // Check if the name and year of the two books are the same
        if (this.name.equals(compBook.getName()) && this.year == compBook.getYear()) { 
            return true; // If they are the same, the two books are equal
        }

        return false; // If they are not the same, the two books are not equal
    }
}
