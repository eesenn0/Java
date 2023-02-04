import java.util.Scanner; // to use scanner

public class SumOfNumbers { // SumOfNumbers class

    public static void main(String[] args) { // main method
        // create scanner to take an input
        Scanner scanner = new Scanner(System.in);
        // initialize sum
        int sum = 0;
        // initialize numbers_read
        int numbers_read = 0;
        
        // conditional statement
        while(true) {
            if (numbers_read == 5) { // conditional statement
                break; // break the if statement when numbers_read = 5
            }
            // taking input
            System.out.println("Enter a number;");
            // adding numbers to sum each time
            sum += Integer.valueOf(scanner.nextLine());
            // adding to numbers_read each time
            numbers_read += 1;
        }
        // print the sum of numbers
        System.out.println("The sum of numbers is " + sum);
    } // end of main method
} // end of SumOfNumbers class
