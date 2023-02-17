import java.io.IOException;  // importing the 'IOException' class
import java.nio.file.Paths;  // importing the 'Paths' class from the 'nio.file' package
import java.util.Scanner;    // importing the 'Scanner' class from the 'util' package
import java.util.ArrayList;  // importing the 'ArrayList' class from the 'util' package

public class MainProgram {  // declaring a class called 'MainProgram'

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);  // creating a new scanner object that reads input from the console
        ArrayList<Integer> list = new ArrayList<>();  // creating a new ArrayList to hold integers

        System.out.println("File?");  // prompting the user to enter a file name
        String file_name = scanner.nextLine();  // reading the file name from the console

        Scanner reader = new Scanner(Paths.get(file_name));  // creating a new scanner object that reads from the file with the given name

        System.out.println("Lower bound?");  // prompting the user to enter a lower bound for the range of numbers to read from the file
        int low_bound = Integer.parseInt(scanner.nextLine());  // reading the lower bound from the console and converting it to an integer

        System.out.println("Upper bound?");  // prompting the user to enter an upper bound for the range of numbers to read from the file
        int upp_bound = Integer.parseInt(scanner.nextLine());  // reading the upper bound from the console and converting it to an integer

        while (reader.hasNextLine()) {  // loop through the file until there are no more lines to read
            int row = Integer.parseInt(reader.nextLine());  // read the next line from the file and convert it to an integer

            if (low_bound <= row && upp_bound >= row) {  // check if the number is within the given range
                list.add(row);  // add the number to the list if it is within the range
            }
        }

        System.out.println("Numbers: " + list.size());  // print the number of elements in the list
    }
}
