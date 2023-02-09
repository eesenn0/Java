import java.util.Scanner; // to use scanner
import java.util.ArrayList; // to use arraylist

public class IndexNotFound { // IndexNotFound class

    public static void main(String[] args) { // main method
        int numbers[] = new int[5]; // declaring an array
        Scanner scanner = new Scanner(System.in);
        int i;
        for (i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("There are " + numbers.length + " elements in the"
                + " array.");

        System.out.println("Search for?");
        int search = Integer.parseInt(scanner.nextLine());

        // boolean
        boolean found = false;
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                System.out.println(search + " is at index " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println(search + " was not found.");
        }

    } // end main method
}  // end IndexNotFound class
