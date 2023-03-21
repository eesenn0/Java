import java.util.HashMap;

public class JavaApplication42 {

    public static void main(String[] args) {
        // Create a new HashMap that maps strings to Book objects
        HashMap<String, Book> hashmap = new HashMap<>();
        
        // Add two Book objects to the HashMap
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));
        
        // Print all the Book objects in the HashMap
        Program.printValues(hashmap);
        
        // Print the name of any Book object in the HashMap whose key contains the specified text
        System.out.println("---");
        Program.printValueIfNameContains(hashmap, "prejud");
    }
    
}

class Program {
    
    // Print all the Book objects in the specified HashMap
    public static void printValues(HashMap<String, Book> hashmap) {
        for (String key : hashmap.keySet()) {
            // Print the Book object associated with the current key
            System.out.println(hashmap.get(key));
        }
    }
    
    // Print the name of any Book object in the specified HashMap whose key contains the specified text
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                // Print the name of the Book object associated with the current key
                System.out.println(hashmap.get(key).getName());
            }
        }
    }
}

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
// Define a separate class named Book
public class Book {
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
