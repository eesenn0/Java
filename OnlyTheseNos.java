// to use scanner
import java.util.Scanner;
// to use arraylist
import java.util.ArrayList;

// OnlyTheseNos class
public class OnlyTheseNos {

    public static void main(String[] args) { // main method
        // create scanner to take inputs
        Scanner scanner = new Scanner(System.in);
        // create list to store strings
        ArrayList<Integer> list = new ArrayList<>();

        // while condition
        while (true) {
            int numbers = Integer.parseInt(scanner.nextLine());
            // break condition
            if (numbers == -1) {
                break;
            }
            // adding numbers to "list"
            list.add(numbers);
        }

        // taking inputs
        System.out.println("From Where?");
        int index1 = Integer.parseInt(scanner.nextLine());
        System.out.println("To where?");
        int index2 = Integer.parseInt(scanner.nextLine());

        // while condition
        while (index1 <= index2) {
            System.out.println(list.get(index1));
            index1++;
        }
    } // end main method
} // end OnlyTheseNos class
