import java.util.Scanner; // to use scanner
import java.util.ArrayList; // to use arraylist

public class SumOfAList { // SumOfAList class

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

        int i; // initialize i
        int sum = 0; // initialize sum to zero
        // for loop
        for (i = 0; i < list.size(); i++) {
            // adding the numbers in the list each time
            sum += list.get(i);
        } // end of for loop
      
        // print the sum of numbers
        System.out.println("Sum:" + sum);
    } // end main method
} // end SumOfAList class
