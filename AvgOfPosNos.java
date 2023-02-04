import java.util.Scanner; // to use scanner

public class AvgOfPosNos { // AvgOfPosNos class

    public static void main(String[] args) { // main method

        // creating scanner to take an input
        Scanner scanner = new Scanner(System.in);

        // initialize count and add
        int count = 0;
        int add = 0;

        // conditional statement
        while (true) {
            // taking an input
            int number = Integer.valueOf(scanner.nextLine());

            if (number > 0) {
                count += 1;
                add += number;
            } else if (number == 0) {
                break;
            }
        }
        // average formula
        double average = (double) add / count;

        // if no positive number is inputted
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else { // print the average
            System.out.println(average);
        }
    } // end of main method
} // end of AvgOfPosNos class
