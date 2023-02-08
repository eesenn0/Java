import java.util.Scanner; // to use scanner
import java.util.ArrayList; // to use arraylist

public class IndexOf { // IndexOf class

    public static void main(String[] args) { // main method
        // create a scanner to get input from user
        Scanner scanner = new Scanner(System.in);
        // create a list to store the input values
        ArrayList<Integer> list = new ArrayList<>();

        while (true) { // while condition
            // inputs from user
            int numbers = Integer.parseInt(scanner.nextLine());

            if (numbers == -1) { // break condition
                break;
            }
            // adding number to list
            list.add(numbers);
        }   // end of while condition

        // taking input for which number user wants
        System.out.println("Search for?");
        int number = Integer.parseInt(scanner.nextLine());

        int i = 0; // initialize i

        while (i < list.size()) { // while 0 < list size condition
            int index = list.get(i); // searching every number in list

            if (index == number) {
                // print the number that the user wanted
                // and the number index in list
                System.out.println(number + " is at index " + i);
            }
            i++; // adding to i one each time
        } // end of while loop
    } // end main method
} // end IndexOf class
