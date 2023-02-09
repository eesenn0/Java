import java.util.Scanner; // to use scanner
import java.util.ArrayList; // to use arraylist

public class Swap { // Swap class

    public static void main(String[] args) { // main method
        int numbers[] = new int[5]; // declaring an array
        Scanner scanner = new Scanner(System.in);
        int i;
        for (i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        // which indices user wants to change
        System.out.println("Give two indices to swap:");
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        // invoke swap method
        swap(numbers, first, second);

        for (i = 0; i < numbers.length; i++) { // print the new array
            System.out.println(numbers[i]);
        }
    } // end main method
    // swap method

    public static void swap(int numbers[], int first, int second) {
        // swapping numbers
        int swap = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = swap;
    } // end swap method
}  // end Swap class
