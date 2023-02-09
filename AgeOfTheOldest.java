import java.util.Scanner; // to use scanner

public class AgeOfTheOldest { // AgeOfTheOldest class

    public static void main(String[] args) { // main method
        // create scanner to take inputs
        Scanner scanner = new Scanner(System.in);
        // initialize oldest
        int oldest = 0;

        while (true) { // while condition
            // taking inputs
            String input = scanner.nextLine();

            // break case
            if (input.equals("")) {
                break;
            }
            // split
            String parts[] = input.split(",");
            // making ages as integer
            int ages = Integer.parseInt(parts[1]);

            if (ages > oldest) {
                oldest = ages;
            }
        }
        // print oldest
        System.out.println("Age of oldest: " + oldest);

    } // end main method
}  // end AgeOfTheOldest class
