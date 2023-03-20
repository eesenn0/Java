// Import the HashMap class from the java.util package
import java.util.HashMap;

// Define a public class named JavaApplication42
public class JavaApplication42 {

    // Define the main method that takes an array of Strings as input
    public static void main(String[] args) {
        
        // Create a new instance of the HashMap class with String keys and Book values
        HashMap<String, Book> directory = new HashMap<>();
        
        // Create two new instances of the Book class
        Book senseAndSensibility = new Book("Sense and Sensibility" , 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");
        
        // Add the books to the directory map using their names as keys
        directory.put(senseAndSensibility.getName(), senseAndSensibility);
        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);
        
        // Retrieve and print the Book object associated with the key "Pride and Prejudice"
        Book book = directory.get("Pride and Prejudice");
        System.out.println(book);
    }
    
}

// Define a separate class named Book
class Book {
    // Private fields of the Book class
    private String name;
    private String content;
    private int published;
    
    // Constructor for the Book class
    public Book(String name, int published, String content) {
        this.name = name;
        this.published = published;
        this.content = content;
    }
    
    // Getter method for the book's name
    public String getName() {
        return this.name;
    }
    
    // Setter method for the book's name
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter method for the book's year of publication
    public int getPublished() {
        return this.published;
    }
    
    // Setter method for the book's year of publication
    public void setPublished(int published) {
        this.published = published;
    }
    
    // Getter method for the book's content
    public String getContent() {
        return this.content;
    }
    
    // Setter method for the book's content
    public void setContent(String content) {
        this.content = content;
    }
    
    // Method that returns a string representation of the book
    public String toString() {
        return "Name: " + this.name + " (" + this.published + ")\n" + 
                "Content: " + this.content;
    }
}
