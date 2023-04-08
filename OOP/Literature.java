import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// Define a Books class with a name and age property
public class Books {
    
    public String name;
    public int age;
    
    // Constructor that initializes name and age properties
    public Books(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter method for name property
    public String getName() {
        return this.name;
    }
    
    // Getter method for age property
    public int getAge() {
        return this.age;
    }
    
    // Override the toString() method to display book information
    @Override
    public String toString() {
        return this.name + " recommended for " + this.age + " year-olds or older";              
    }
}

// Define a MainProgram class
public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Books> list = new ArrayList<>();

        // Prompt the user for book information until they enter a blank name
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();

            if (name.isBlank()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int age = Integer.parseInt(scanner.nextLine());

            // Create a new Books object and add it to the list
            list.add(new Books(name, age));
        }

        // Display the total number of books in the list
        System.out.println(list.size() + " books in total");
        System.out.println("Books:");

        // Define a comparator to sort the books by age, then name
        Comparator<Books> comparator = Comparator
                .comparing(Books::getAge)
                .thenComparing(Books::getName);

        // Sort the list using the comparator
        Collections.sort(list, comparator);

        // Display each book in the sorted list
        list.stream()
                .forEach(book -> System.out.println(book));
    }
}
