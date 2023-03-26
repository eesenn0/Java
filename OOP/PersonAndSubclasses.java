import java.util.ArrayList;

public class MainP {

    public static void main(String[] args) {

        // Create an ArrayList of Person objects
        ArrayList<Person> persons = new ArrayList<Person>();

        // Add a Teacher and a Student to the ArrayList
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        // Call the printPersons method to print the ArrayList
        printPersons(persons);
    }

    // Method to print an ArrayList of Person objects
    public static void printPersons(ArrayList<Person> persons) {
        // Use a for-each loop to iterate over the ArrayList
        for (Person person : persons) {
            // Call the toString method of each Person object and print the result
            System.out.println(person.toString());
        }
    }

}

// The Person class represents a person with a name and address
class Person {

    public String name;
    public String address;

    // Constructor to create a Person object with a name and address
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Override the toString method to return a string representation of the Person object
    @Override
    public String toString() {
        return this.name + "\n  " + this.address;
    }
}

// The Student class represents a student with a name, address, and number of credits
class Student extends Person {

    private int stu_credits = 0;

    // Constructor to create a Student object with a name and address
    public Student(String name, String address) {
        super(name, address);
    }

    // Method to return the number of credits for the Student
    public int credits() {
        return stu_credits;
    }

    // Method to increment the number of credits for the Student
    public void study() {
        stu_credits++;
    }

    // Override the toString method to return a string representation of the Student object
    @Override
    public String toString() {
        return name + "\n  " + address + "\n   " + "Study credits " + stu_credits;
    }
}

// The Teacher class represents a teacher with a name, address, and salary
class Teacher extends Person {

    private int salary;

    // Constructor to create a Teacher object with a name, address, and salary
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    // Override the toString method to return a string representation of the Teacher object
    @Override
    public String toString() {
        return name + "\n  " + address + "\n   " + "salary " + this.salary + " euro/month";
    }
}
