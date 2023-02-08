import java.util.Scanner; // to use scanner
import java.util.ArrayList; // to use arraylist

public class PrintInRange { //PrintInRange class

    public static void main(String[] args) { // main method
        // create scanner to get input from user
        Scanner scanner = new Scanner(System.in);
        // create list to store inputs
        ArrayList<Integer> list = new ArrayList<>();

        while (true) { // while loop

            int numbers = Integer.parseInt(scanner.nextLine());

            if (numbers == -1) { // stopping condition
                break;
            }
            list.add(numbers); // adding numbers to the list
        } // end while loop

        System.out.println("Lower limit?");
        int lowerLimit = Integer.parseInt(scanner.nextLine());

        System.out.println("Upper limit?");
        int upperLimit = Integer.parseInt(scanner.nextLine());

        System.out.println("The numbers in the range [" + lowerLimit + ", " + upperLimit + "]");
        // invoke the printNumbersInRange method
        printNumbersInRange(list, lowerLimit, upperLimit);
    } // end main method

    // printNumbersInRange method
    public static void printNumbersInRange(ArrayList<Integer> list, int lowerLimit, int upperLimit) {
        int i;
        for (i = 0; i < list.size(); i++) { // for loop
            // call numbers in our list
            int index = list.get(i);

            // if the number that we've called is greater than the lower limit
            // and smaller than the upper limit, then it will print
            if (index > lowerLimit && index < upperLimit) {
                System.out.println(index);
            } // end condition
        } // end for loop
    } // end printNumbersInRange method
} // end PrintInRange class
