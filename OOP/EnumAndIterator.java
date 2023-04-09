public class MainProgram {

    public static void main(String[] args) {
        // Create a new instance of the Employees class
        Employees university = new Employees();
        // Add three employees to the employees list
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));

        // Print the list of employees
        university.print();

        // Fire all employees with HS education
        university.fire(Education.HS);

        System.out.println("==");

        // Print the list of employees again to show who has been fired
        university.print();
    }
}

// Define an enum for different levels of education
public enum Education {
    PHD, MA, BA, HS
}

// Define a Person class to represent an employee
public class Person {
    public String name;
    public Education edu;

    public Person(String name, Education edu) {
        this.name = name;
        this.edu = edu;
    }

    // Get the education level of the employee
    public Education getEducation() {
        return this.edu;
    }

    // Return the name and education level of the employee as a string
    @Override
    public String toString() {
        return this.name + ", " + this.edu;
    }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Define a class to manage a list of employees
public class Employees {
    List<Person> employees;

    // Create a new instance of the Employees class with an empty employees list
    public Employees() {
        this.employees = new ArrayList<>();
    }

    // Add an employee to the employees list
    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    // Add a list of employees to the employees list
    public void add(List<Person> peopleToAdd) {
        this.employees.addAll(peopleToAdd);
    }

    // Print the list of employees
    public void print() {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Print the list of employees with a specific education level
    public void print(Education education) {
        this.employees.stream()
                .filter(e -> e.getEducation() == education)
                .forEach(a -> System.out.println(a));
    }

    // Fire all employees with a specific education level
    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
