import java.util.Scanner; // to use scanner

public class DivisibleByThree { // DivisibleByThree class

    public static void main(String[] args) { // main method

        // create scanner to take an input
        Scanner scanner = new Scanner(System.in);
        // taking two numbers from user
        System.out.println("Input two numbers");
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        // invoke the method
        divisibleByThreeInRange(num1, num2);

    } // end of main method

    // divisibleByThreeInRange method
    public static void divisibleByThreeInRange(int beginning, int end) {
        int i; // initialize i
        // determination of smaller number
        if (beginning < end) {
            for (i = beginning; i <= end; i++) { // // for loop
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        } else if (end < beginning) {
            for (i = end; i <= beginning; i++) { // // for loop
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        } // it means end and beginning are same numbers
        // without loss of generality, let us use "end"
        else {
            if (end % 3 == 0) {
                System.out.println(end);
            }
        }
    } // end of divisibleByThreeInRange method
} // end of DivisibleByThree class
