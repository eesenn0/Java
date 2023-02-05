import java.util.ArrayList; // to use arraylist
import java.util.Scanner; // to use scanner

public class ThirdElement { // ThirdElement class

    public static void main(String[] args) { // main method
        // create list
        ArrayList<String> list = new ArrayList<>();
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // while loop
        // loop will work till the user enters an empty string
        while (true) {
            // taking input from user
            String names = scanner.nextLine();
            // break case
            if ("".equals(names)) {
                break;
            }
            // adding names our "list"
            list.add(names);

        }
        // print the value of index 2
        System.out.println(list.get(2));
    } // end main method
} // end ThirdElement class
