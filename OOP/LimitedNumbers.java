import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram06 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(); // create an ArrayList to store integers
        
        // read input from the user until a negative number is entered
        while (true) {
            int number = Integer.parseInt(scanner.nextLine()); // read an integer from the user
            
            if (number < 0) { // if the integer is negative, break out of the loop
                break;
            }
            
            list.add(number); // add the integer to the ArrayList
        }
        
        // print all integers in the ArrayList that are between 1 and 5 (inclusive)
        list.stream()
                .filter(value -> value >= 1 && value <= 5) // filter the list to include only values between 1 and 5
                .forEach(value -> System.out.println(value)); // print each filtered value to the console
    }
}
