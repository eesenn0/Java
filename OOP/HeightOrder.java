public class MainProgram {

    public static void main(String[] args) {
        // Create a new room object to store the people
        Room room = new Room();

        // Add people to the room
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));

        // Take people from the room until the room is empty
        while (!room.isEmpty()) {
            // Print the shortest person in the room and remove them from the list
            System.out.println(room.take());
        }
    }
}

// A class to represent a person
class Person {
    private String name;
    private int height;
    
    // Constructor to create a new person with a name and height
    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }
    
    // Getter method to get the height of the person
    public int getHeight() {
        return this.height;
    }
            
    // toString method to print the name and height of the person
    @Override
    public String toString() {
        return this.name + "(" + this.height + " cm)";
    }
}

// A class to represent a room of people
import java.util.ArrayList;

class Room {

    private ArrayList<Person> list;

    // Constructor to create a new empty room
    public Room() {
        this.list = new ArrayList<>();
    }

    // Method to add a person to the room
    public void add(Person person) {
        list.add(person);
    }

    // Method to check if the room is empty
    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        }

        return false;
    }

    // Method to get the list of people in the room
    public ArrayList<Person> getPersons() {
        return list;
    }

    // Method to get the shortest person in the room
    public Person shortest() {
        if (list.isEmpty()) {
            return null;
        }

        // Initialize the returnObject with the first person in the list
        Person returnObject = list.get(0);

        // Loop through the list and compare the height of each person to returnObject
        for (Person prs : list) {
            if (returnObject.getHeight() > prs.getHeight()) {
                // If prs is shorter than returnObject, set returnObject to prs
                returnObject = prs;
            }
        }

        // Return the shortest person in the list
        return returnObject;
    }

    // Method to take the shortest person out of the room
    public Person take() {
        if (list.isEmpty()) {
            return null;
        }

        // Get the shortest person in the room
        Person shortest = shortest();

        // Remove the shortest person from the list
        list.remove(shortest);
                
        // Return the shortest person
        return shortest;
    }

}
