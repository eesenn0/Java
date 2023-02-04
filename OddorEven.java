import java.util.Scanner; // to use scanner

public class OddorEven { // OddorEven class

    public static void main(String[] args) { // main method
        // create scanner to take inputs
        Scanner scanner = new Scanner(System.in);

        // taking input
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());

        // conditional statements
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else if (number % 2 != 0) {
            System.out.println("Number " + number + " is not even.");
        }

    } // end of main method
} // end of LargerOrEqual class
