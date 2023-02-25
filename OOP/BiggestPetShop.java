public class MainProgram {

    public static void main(String[] args) {
        // Creating a new Pet object named Lucy, which is a golden retriever
        Pet lucy = new Pet("Lucy", "golden retriever");
        
        // Creating a new Person object named Leo, who is the owner of the Pet object Lucy
        Person leo = new Person("Leo", lucy);

        // Printing the Person object Leo, which will call the toString() method of the Person class
        System.out.println(leo);
    }
}

// Defining the Person class
class Person {
    private String name; // private variable to store the person's name
    private Pet owner; // private variable to store the person's pet
    
    // Constructor method for the Person class, which takes a name and a Pet object as input
    public Person(String name, Pet owner) {
        this.name = name; // set the person's name
        this.owner = owner; // set the person's pet
    }
    
    // Getter method for the person's name
    public String getName() {
        return this.name;
    }
    
    // Override the toString() method of the Object class to return a String representation of the Person object
    @Override
    public String toString() {
        return getName() + ", has a friend called " + this.owner; // return a String that includes the person's name and the name of their pet
    }
}

// Defining the Pet class
class Pet {
    private String name; // private variable to store the pet's name
    private String breed; // private variable to store the pet's breed
    
    // Constructor method for the Pet class, which takes a name and a breed as input
    public Pet(String name, String breed) {
        this.name = name; // set the pet's name
        this.breed = breed; // set the pet's breed
    }
    
    // Getter method for the pet's name
    public String getPetName() {
        return this.name;
    }
    
    // Getter method for the pet's breed
    public String getBreed() {
        return this.breed;
    }
    
    // Override the toString() method of the Object class to return a String representation of the Pet object
    public String toString() {
        return this.name + "(" + this.breed + ")"; // return a String that includes the pet's name and breed in parentheses
    }
}
