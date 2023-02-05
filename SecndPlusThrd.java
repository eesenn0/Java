// to use scanner
import java.util.Scanner;
// to use arraylist
import java.util.ArrayList;

// SecndPlusThrd class
public class GradeBook {

    public static void main(String[] args) { // main method
        // create scanner to take inputs
        Scanner scanner = new Scanner(System.in);
        // create list to store numbers
        ArrayList<Integer> list = new ArrayList<>();

        // conditional statement
        while (true) {
            // taking inputs in a loop
            int numbers = Integer.parseInt(scanner.nextLine());

            // break case
            if (0 == numbers) {
                break;
            }   // adding numbers in "list"
            list.add(numbers);
        }   // end of while loop

        // calling numbers in "list" and add index of one and two
        System.out.println(list.get(1) + list.get(2));
    } // end main method
} // end SecndPlusThrd class
