// This is the main class where the program starts executing
public class Main {
        
    public static void main(String[] args) {
        // Create a new Person object named "matt" with a name of "Matt"
        Person matt = new Person("Matt");
        // Set the height and weight of "matt"
        matt.setHeight(180);
        matt.setWeight(86);
        
        // Create a new Person object named "jasper" with a name of "Jasper"
        Person jasper = new Person("Jasper");
        // Set the height and weight of "jasper"
        jasper.setHeight(132);
        jasper.setWeight(34);
        
        // Create a new AmusementParkRide object named "waterTrack" with a name of "Water track" and a minimum height of 140
        AmusementParkRide waterTrack = new AmusementParkRide("Water track", 140);
        
        // Check if "matt" is allowed to ride on "waterTrack"
        if(waterTrack.allowedToRide(matt)) {
            // Print a message saying that "matt" is allowed to enter the ride
            System.out.println(matt.getName() + " may enter the ride");
        }
        else {
            // Print a message saying that "matt" is not allowed to enter the ride
            System.out.println(matt.getName() + " may not enter the ride");
        }
        
        // Check if "jasper" is allowed to ride on "waterTrack"
        if(waterTrack.allowedToRide(jasper)) {
            // Print a message saying that "jasper" is allowed to enter the ride
            System.out.println(jasper.getName() + " may enter the ride");
        }
        else {
            // Print a message saying that "jasper" is not allowed to enter the ride
            System.out.println(jasper.getName() + " may not enter the ride");
        }
        
        // Print the details of "waterTrack"
        System.out.println(waterTrack);
    }
}
// This is the Person class which represents a person with a name, age, weight, and height
class Person {
    
    // Private instance variables for the person's name, age, weight, and height
    private String name;
    private int age;
    private int weight;
    private int height;
    
    // Constructor that takes only the person's name and sets the other variables to 0
    public Person(String name) {
        this(name, 0, 0, 0);
    }
    
    // Constructor that takes the person's name, age, weight, and height
    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    
    // Getter method for the person's name
    public String getName() {
        return this.name;
    }
    
    // Getter method for the person's age
    public int getAge() {
        return this.age;
    }
    
    // Getter method for the person's height
    public int getHeight() {
        return this.height;
    }
    
    // Method that increments the person's age by 1 and returns the new age
    public int growOlder() {
        return this.age += 1;
    }
    
    // Setter method for the person's height
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }
    
    // Setter method for the person's weight
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
    
    // Method that calculates the person's body mass index (BMI)
    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }
    
    // Override the toString method to print the person's name and age
    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}
// This is the AmusementParkRide class which represents a ride in an amusement park
class AmusementParkRide {
    
    // Private instance variables for the ride's name, lowest height requirement, and number of visitors
    private String name;
    private int lowestHeight;
    private int visitors;
    
    // Constructor that takes the ride's name and lowest height requirement
    public AmusementParkRide(String name, int lowestHeight) {
        this.name = name;
        this.lowestHeight = lowestHeight;
        this.visitors = 0;
    }
    
    // Method that checks whether a person is allowed to ride and updates the number of visitors
    public boolean allowedToRide(Person person) {
        if(person.getHeight() < this.lowestHeight) {
            return false;
        }
        
        this.visitors++;
        return true;
    }
    
    // Override the toString method to print the ride's name, lowest height requirement, and number of visitors
    public String toString() {
        return this.name + ", minimum height: " + this.lowestHeight + ", visitors: "
                 + this.visitors;
    }
}
