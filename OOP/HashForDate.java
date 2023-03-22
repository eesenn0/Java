public class JavaApplication44 {

    public static void main(String[] args) {
        // Create a new SimpleDate object with day 1, month 2, and year 2000
        SimpleDate date = new SimpleDate(1, 2, 2000);
        
        // Check if the date object equals the string "heh" and print the result
        System.out.println(date.equals("heh"));
        
        // Check if the date object equals a new SimpleDate object with day 5, month 2, and year 2012, and print the result
        System.out.println(date.equals(new SimpleDate(5, 2, 2012)));
        
        // Check if the date object equals a new SimpleDate object with day 1, month 2, and year 2000, and print the result
        System.out.println(date.equals(new SimpleDate(1, 2, 2000)));
    }

}

import java.util.Objects;

class SimpleDate {

    private int day;
    private int month;
    private int year;

    // Constructor for creating a new SimpleDate object with specified day, month, and year
    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    // Method for checking if this SimpleDate object is equal to another object
    @Override
    public boolean equals(Object comparedObject) {
        // If the compared object is the same object as this, they are equal
        if (this == comparedObject) {
            return true;
        }
        
        // If the compared object is not a SimpleDate object, they are not equal
        if (!(comparedObject instanceof SimpleDate)) {
            return false;
        }
        
        // Cast the compared object to a SimpleDate object and compare the day, month, and year fields
        SimpleDate comparedDate = (SimpleDate) comparedObject;
        if (this.day == comparedDate.day && this.month == comparedDate.month &&
                 this.year == comparedDate.year) {
            return true
        }
      
        return false;
    }
  
    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}
