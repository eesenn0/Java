import java.util.Scanner; // to use scanner

public class AverageOfAges { // AverageOfAges class

    public static void main(String[] args) { // main method
        // create scanner to take inputs
        Scanner scanner = new Scanner(System.in);
        // initialize count and sum
        int count = 0;
        int sum = 0;

        while (true) { // while condition
            String input = scanner.nextLine();

            // break case
            if (input.equals("")) {
                break;
            }
            // split
            String parts[] = input.split(",");
            // adding "numbers" after comma
            sum += Integer.parseInt(parts[1]);
            count += 1;
        }
        if (count > 0) {
            // calculation average formula
            System.out.println("Average: " + (1.0 * sum / count));
        } else {
            System.out.println("No input.");
        }

    } // end main method
}  // end AverageOfAges class
