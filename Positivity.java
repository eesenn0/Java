import java.util.Scanner; // to use scanner

public class Positivity { // Positivity class

    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in);  // create scanner to take inputs

        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());

        if (number > 0) { // if conditional statement
            System.out.println("The number is positive");
        } else if (number < 0) { // else if conditional statement
            System.out.println("The number is negative");
        } else { // else conditional statement
            System.out.println("It's zero");
        }
    } // end of main method
} // end of Positivity class
