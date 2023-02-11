import java.util.Scanner; // to take inputs

public class Main { // Main class
    public static void main(String[] args) { // Main method
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Get the user's name
        System.out.println("Name?");
        String name = scanner.nextLine();

        // Get the user's age
        System.out.println("Age?");
        int age = Integer.parseInt(scanner.nextLine());

        // Get the user's height
        System.out.println("Height?");
        int height = Integer.parseInt(scanner.nextLine());

        // Get the user's weight
        System.out.println("Weight?");
        int weight = Integer.parseInt(scanner.nextLine());

        // Create a Person object with the given information
        Person user = new Person(name, age, height, weight);

        // Print the body mass index of the user
        System.out.println(user.bodyMassIndex());
    } // End main method
} // End Main class

class Person { // Person class
    // Properties of a person
    String name;
    int age;
    int height;
    int weight;

    // Constructor to initialize a person's information
    public Person(String initialName, int initialAge, int initialHeight,
            int initialWeight) {

        this.name = initialName;
        this.age = initialAge;
        this.height = initialHeight;
        this.weight = initialWeight;
    }

    // Method to calculate and return the body mass index of a person
    public double bodyMassIndex() {
        // Convert height to meters
        double heightPerHundred = this.height / 100.00;
        // Calculate body mass index
        double bodymass = this.weight / (heightPerHundred * heightPerHundred);
        // Print the result with the person's name
        System.out.println(this.name + ", body mass index is " + bodymass);
        // Return the result
        return bodymass;
    }
}
