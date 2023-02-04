import java.util.Scanner; // to use scanner

public class Factorial { // Factorial class

    public static void main(String[] args) { // main method

        // creating scanner to take an input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.parseInt(scanner.nextLine());

        // initialize the factorial
        int factorial = 1;
        // for loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        // print factorial
        System.out.println("Factorial: " + factorial);

    } // end of main method
} // end of Factorial class
