import java.util.Scanner; // to use scanner

public class SumOfASequence { // SumOfASequence class

    public static void main(String[] args) { // main method

        // creating scanner to take an input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int number = Integer.parseInt(scanner.nextLine());

        // initialize the variables
        int sum = 0;
        int i;

        for (i = 1; i <= number; i++) {
            sum += i;
        }
        // print sum
        System.out.println("The sum is " + sum);

    } // end of main method
} // end of SumOfASequence class
