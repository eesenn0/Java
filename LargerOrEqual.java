import java.util.Scanner; // to use scanner

public class LargerOrEqual { // LargerOrEqual class

    public static void main(String[] args) { // main method
        // create scanner to take inputs
        Scanner scanner = new Scanner(System.in);

        // take the first number
        System.out.println("Give the first number:");
        int number_1 = Integer.valueOf(scanner.nextLine());
        // take the second number
        System.out.println("Give the second number:");
        int number_2 = Integer.valueOf(scanner.nextLine());

        if (number_1 > number_2) { // if conditional statement
            System.out.println("Greater number is:" + number_1);
        } else if (number_1 < number_2) { // else if conditional statement
            System.out.println("Greater number is:" + number_2);
        } else { // else conditional statement
            System.out.println("The numbers are equal!");
        }
    } // end of main method
} // end of LargerOrEqual class
