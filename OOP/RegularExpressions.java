import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Checker checker = new Checker();
        
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        
        // call the timeOfDay method of the Checker class and pass the user input as an argument
        checker.timeOfDay(string);
    }
}

public class Checker {
    
    public Checker() {
        // default constructor
    }
    
    public boolean isDayOfWeek(String string) {
        // checks if the string matches any of the day of week abbreviations
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            System.out.println("The form is correct.");
            return true;
        }
        
        System.out.println("The form is incorrect.");
        return false;
    }
    
    public boolean allVowels(String string) {
        // checks if the string contains only vowels
        if (string.matches("[aeiou]+")) {
            System.out.println("The form is correct.");
            return true;
        }
        
        System.out.println("The form is incorrect.");
        return false;
    }
    
    public boolean timeOfDay(String string) {
        // checks if the string matches the 24-hour time format of hh:mm:ss, where hh can be 00-23, mm can be 00-59, and ss can be 00-59
        if (string.matches("(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")) {
            System.out.println("The form is correct.");
            return true;
        }
        
        System.out.println("The form is incorrect.");
        return false;
    }
}
