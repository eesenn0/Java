public class MainProgram {

    public static void main(String[] args) {
        // Create a new box with a capacity of 10
        Box box = new Box(10);

        // Add three books to the box
        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        // Add three CDs to the box
        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        // Print the contents of the box
        System.out.println(box);
    }

}
interface Packable {
    double weight();    
}

class Book implements Packable {
    private String author;
    private String name;
    private double weight;
    
    public Book(String author, String name, double weight) {
        // Constructor to initialize the instance variables
        this.author = author;
        this.name = name;
        this.weight = weight;
    }
    
    @Override
    public double weight() {
        // Method implementation for the Packable interface
        return this.weight;
    }
    
    public String toString() {
        // Method to return a string representation of the object
        return this.author + ": " + this.name;
    }
}

class CD implements Packable {
    private String artist;
    private String name;
    private int pubYear;
    private double weight;
    
    public CD(String artist, String name, int pubYear) {
        // Constructor to initialize the instance variables
        this.artist = artist;
        this.name = name;
        this.pubYear = pubYear;
        this.weight = 0.1;
    }
    
    @Override
    public double weight() {
        // Method implementation for the Packable interface
        return this.weight;
    }
    
    public String toString() {
        // Method to return a string representation of the object
        return this.artist + ": " + this.name + " (" + this.pubYear + ")";
    }
    
}

class Box implements Packable {
    
    private ArrayList<Double> list;
    private double capacity;
    
    public Box(double capacity) {
        // Constructor to initialize the instance variables
        this.capacity = capacity;
        this.list = new ArrayList<>();        
    }               
    
    @Override
    public double weight() {
        // Method implementation for the Packable interface
        double weight = 0;
        
        for (int i = 0; i < list.size(); i++) {
            weight += list.get(i);
        }
        
        return weight;
    }        
    
    public void add(Packable item) {
        // Method to add a Packable item to the list
        double itemWeight = item.weight();
        if (weight() + itemWeight > this.capacity) {
            // If weight limit is exceeded, print a message and return
            System.out.println("Weight limit exceeded.");
            return;
        }
        this.list.add(itemWeight);
    }
    
    @Override
    public String toString() {
        // Method to return a string representation of the object
        return "Box: " + list.size() + " items, total weight " + weight() + " kg";
    }
}
