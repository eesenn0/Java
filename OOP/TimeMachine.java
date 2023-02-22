public class Main {
    
    public static void main(String[] args) {
        // Creating a new Person object named lorraine
        Person lorraine = new Person();
        
        // Creating a new TimeMachine object named tardis and passing the lorraine Person object to its constructor
        TimeMachine tardis = new TimeMachine(lorraine);
        
        // Traveling in time by calling the travelInTime method on tardis and passing in the number of years to travel (6)
        tardis.travelInTime(6);
        
        // Printing the year of the lorraine Person object after time travel
        System.out.println(lorraine.getYear());
    }
}

// Person class
class Person {
    
    // Instance variable for the year of birth
    private int year;
    
    // Constructor method for Person class that sets the year to 1996
    public Person() {
        this.year = 1996;
    }
    
    // Getter method for the year of birth
    public int getYear() {
        return this.year;
    }
    
    // Setter method for the year of birth
    public void setYear(int year) {
        this.year = year;
    }
}

// TimeMachine class
class TimeMachine {
    
    // Instance variable for the traveler (Person) using the time machine
    private Person traveler;
    
    // Constructor method for TimeMachine class that takes a Person object as a parameter and sets the traveler instance variable
    public TimeMachine(Person person) {
        this.traveler = person;
    }
    
    // Method to travel in time by changing the year of birth of the traveler Person object
    public void travelInTime(int years) {
        this.traveler.setYear(this.traveler.getYear() + years);
    }
}
