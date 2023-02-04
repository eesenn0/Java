import java.util.Scanner; // to use scanner

public class NumberOfNumbers { // NumberOfNumbers class

    public static void main(String[] args) { // main method

        // creating scanner to take a input
        Scanner scanner = new Scanner(System.in);

        // to counting numbers
        int count = 0;

        // conditional statement
        while (true) {
            System.out.println("Give a number:");
            // taking input
            int number = Integer.valueOf(scanner.nextLine());
            // conditional statements
            if (number == 0) {
                break;
            } else { // if the number is not 0, then add one to count
                count += 1;
            }
        }
        // print the number of numbers
        System.out.println("Number of numbers: " + count);

    } // end of main method
} // end of NumberOfNumbers class
