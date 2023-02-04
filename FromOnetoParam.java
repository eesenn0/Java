import java.util.Scanner; // to use scanner

public class FromOnetoParam { // FromOnetoParam class

    public static void main(String[] args) { // main method

        // create scanner to take an input
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");
        int times = Integer.parseInt(scanner.nextLine());

        // invoke printUntilNumber method
        printUntilNumber(times); // put "times" as a parameter

    } // end of main method

    public static void printUntilNumber(int number) { // livedMethod method
        int i; // initialize i
      
        // for loop
        for (i = 1; i <= number; i++) {
            System.out.println(i);
        }
    } // end of printUntilNumber method
} // end of FromOnetoParam class
