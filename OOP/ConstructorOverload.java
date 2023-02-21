// A public class named MainProgram is defined
public class MainProgram {
    
    // The main method, the starting point of the program, is defined
    public static void main(String[] args) {
        
        // Three instances of the Product class are created with different arguments
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);
        
        // The details of each Product instance are printed to the console
        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}

// A class named Product is defined
class Product {

    // Three private instance variables, name, location, and weight, are defined
    private String name;
    private String location;
    private int weight;

    // A constructor that takes three arguments is defined
    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }
    
    // Overloaded constructors that take fewer arguments are defined
    public Product(String name) {
        this(name, "shelf", 1);
    }
    
    public Product(String name, String location) {
        this(name, location, 1);
    }
    
    public Product(String name, int weight) {
        this(name, "shelf", weight);
    }
    
    // An overridden toString() method is defined to return the details of a Product instance as a String
    @Override
    public String toString() {
        return name + "(" + weight + " kg) " + "can be found from " + location;
    }
}
