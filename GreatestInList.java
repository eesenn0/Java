// to use scanner
import java.util.Scanner;
// to use arraylist
import java.util.ArrayList;

// GreatestInList class
public class GreatestInList {

    public static void main(String[] args) { // main method
        // create scanner to take inputs
        Scanner scanner = new Scanner(System.in);
        // create list to store numbers
        ArrayList<Integer> list = new ArrayList<>();

        // while condition to store numbers
        while (true) {
            int numbers = Integer.parseInt(scanner.nextLine());
            // break condition
            if (numbers == -1) {
                break;
            }
            // adding numbers to "list"
            list.add(numbers);
        }
        // initializing variables
        int index0 = 0;
        int index1 = 1;
        int greater = 0;

        // while loop for comparison of the numbers that we've stored
        while (index0 < list.size() && index1 < list.size()) {
            // number at index 0 (first number)
            int first = list.get(index0);
            // number at index 1 (second number)
            int second = list.get(index1);

            // conditions that indicate which number at
            // each two indexes are greater
            if (first > second) {
                greater = first;
                index1++;
            } else if (second > first) {
                greater = second;
                index0++;
            } else {
                greater = second;
                index0++;
            }
        }
        // print the greatest value
        System.out.println("The greatest number: " + greater);

    } // end main method
} // end GreatestInList class
