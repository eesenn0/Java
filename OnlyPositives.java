import java.util.Scanner; // to use scanner

public class OnlyPositives { // OnlyPositives class

    public static void main(String[] args) { // main method

        // creating scanner to take a input
        Scanner scanner = new Scanner(System.in);

        // conditional statement
        while (true) {
            System.out.println("Give a number");
            // take input from user
            int number = Integer.valueOf(scanner.nextLine());
            // conditional statements
            if (number < 0) {
                System.out.println("Unsuitable number");
                continue; // restart the execution
            }
            if (number == 0) {
                break; // end the program
            }
            if (number > 0) {
                // if the number is positive, then take square
                System.out.println(number * number);
                continue; // restart the execution
            }
            System.out.print(number + " ");
        }

    } // end of main method
} // end of OnlyPositives class
