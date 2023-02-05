// to use scanner
import java.util.Scanner;
// to use arraylist
import java.util.ArrayList;

// LastinList class
public class LastinList {

    public static void main(String[] args) { // main method
        // create scanner to take inputs
        Scanner scanner = new Scanner(System.in);
        // create list to store strings
        ArrayList<String> list = new ArrayList<>();

        // while loop
        while (true) {
            // taking names from user
            String names = scanner.nextLine();

            // break case
            if ("".equals(names)) {
                break;
            }
            // store inputs in "list"
            list.add(names);
        }
        // last index = number of names in "list" - 1
        int last_index = list.size() - 1;
        // print last name
        System.out.println(list.get(last_index));
    } // end main method
} // end LastinList class
