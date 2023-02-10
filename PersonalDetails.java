import java.util.Scanner; // Import the Scanner class to take inputs from the user

public class GradeBook { // Define the PersonalDetails class

    public static void main(String[] args) { // main method
        // create a scanner object to take inputs
        Scanner scanner = new Scanner(System.in);

        // initialize variables
        int sum = 0;
        int count = 0;
        int size = 0;
        String longestName = "";

        // start an infinite loop to take inputs until the user inputs an empty line
        while (true) {
            // take the input as a string
            String input = scanner.nextLine();

            // if the input is an empty line, break out of the loop
            if (input.equals("")) {
                break;
            }

            // split
            String parts[] = input.split(",");

            // get the length of the name
            int nameLength = parts[0].length();

            /* if the length of the current name is greater than the current 
            value of "size", update "size" to the length of the current name 
            and update "longestName" to the current name */
            if (nameLength > size) {
                size = nameLength;
                longestName = parts[0];
            }
            // add their birth year to the sum
            sum += Integer.parseInt(parts[1]);

            // increment the count of inputs
            count++;
        }
        // print the longest name and the average of birth years
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of birth years: " + (1.0 * sum / count));
    } // end main method
}  // end PersonalDetails class
