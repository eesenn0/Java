public class MainProgram {

    public static void main(String[] args) {
        // Create two SimpleDate objects
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        // Create two Person objects
        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);

        // Check if leo is equal to lily using the equals method
        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        } else {
            System.out.println("Something went wrong");
        }

        // Create a new Person object with the same name, birthday, and height as leo, but a different weight
        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

        // Check if leo is equal to leoWithDifferentWeight using the equals method
        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        } else {
            System.out.println("Something went wrong");
        }
    }

}

class Person {

    // Declare instance variables for Person class
    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;
    
    // Constructor for Person class
    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.weight = height;
        this.weight = weight;
    }
    
    // Override the equals method to compare Person objects based on their instance variables
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person compPerson = (Person) compared;

        if (this.name == compPerson.name && this.birthday == compPerson.birthday
                && this.height == compPerson.height && this.weight == compPerson.weight) {
            return true;
        }

        return false;
    }
   
}

class SimpleDate {
    // Declare instance variables for SimpleDate class
    private final int day;
    private final int month;
    private final int year;

    // Constructor for SimpleDate class
    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getter methods for SimpleDate class
    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    // Override the equals method to compare SimpleDate objects based on their instance variables
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof SimpleDate)) {
            return false;
        }

        SimpleDate comparedSimpleDate = (SimpleDate) compared;

        if (this.day == comparedSimpleDate.day &&
            this.month == comparedSimpleDate.month &&
            this.year == comparedSimpleDate.year) {
            return true;
        }

        return false;
    }

    // Override the toString method to return a String representation of a SimpleDate object
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
