// Import to make an ArrayList
import java.util.ArrayList; 

public class Main { // Main class

    public static void main(String[] args) { // Main method
        // Create an instance of the Statistics class
        Statistics statistics = new Statistics();

        // Add numbers to the list
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);

        // Print the count of the numbers in the list
        System.out.println("Count: " + statistics.getCount());

        // Print the sum of the numbers in the list
        System.out.println("Sum: " + statistics.sum());

        // Print the average of the numbers in the list
        System.out.println("Average: " + statistics.average());
    } // End main method
} // End Main class

class Statistics { // Statistics class

    // Variables to keep track of the count and sum of the numbers
    int count;
    int sum;

    // A list to store the numbers
    ArrayList<Integer> list = new ArrayList<>();

    // Method to add a number to the list
    public void addNumber(int number) {
        list.add(number);
    }

    // Method to get the count of the numbers in the list
    public int getCount() {
        count = list.size();
        return count;
    }

    // Method to calculate the sum of the numbers in the list
    public int sum() {
        int i = 0;
        while (i < list.size()) {
            sum += list.get(i);
            i++;
        }
        return sum;
    }

    // Method to calculate the average of the numbers in the list
    public double average() {
        return 1.0 * sum / list.size();
    }
} // End Statistics class
