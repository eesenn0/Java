// Define a public class called LotterySimulator
public class LotterySimulator {

    // Define the main method
    public static void main(String[] args) {
        // Create a new instance of the LotteryRow class
        LotteryRow row = new LotteryRow();
        // Get the lottery numbers from the row
        ArrayList<Integer> lotteryNumbers = row.numbers();

        // Print out the lottery numbers to the console
        System.out.println("Lottery numbers:");
        for (int number : lotteryNumbers) {
            System.out.print(number + " ");
        }

        // Print out a newline character to the console for formatting
        System.out.println("");
    }
}
// Import necessary libraries
import java.util.ArrayList;
import java.util.Random;

// Define a class called LotteryRow
class LotteryRow {

    // Declare private member variables
    private ArrayList<Integer> numbers;
    private Random random;

    // Define a constructor method
    public LotteryRow() {
        // Initialize a new Random object
        this.random = new Random();
        // Call the randomizeNumbers method to generate a new set of lottery numbers
        this.randomizeNumbers();
    }

    // Define a public method to get the lottery numbers
    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    // Define a public method to check if a given number is included in the lottery numbers
    public boolean containsNumber(int number) {
        if (numbers.contains(number)) {
            return true;
        }

        return false;
    }

    // Define a private method to generate a new set of lottery numbers
    private void randomizeNumbers() {
        // Initialize a new ArrayList to store the lottery numbers
        this.numbers = new ArrayList<>();

        // Generate 7 random numbers between 1 and 40 and add them to the ArrayList
        for (int i = 0; i < 7; i++) {
            int randomNumber = random.nextInt(40) + 1;
            this.numbers.add(randomNumber);
        }
    }
}
