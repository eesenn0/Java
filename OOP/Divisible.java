import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainProgram06 {

    public static void main(String[] args) {
        // Create a new ArrayList to hold the numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some numbers to the list
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        // Call the divisible method to filter the numbers
        ArrayList<Integer> divisible = divisible(numbers);

        // Print the filtered numbers
        divisible.stream()
                .forEach(num -> System.out.println(num));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        // Filter the numbers to keep only those that are divisible by 2, 3 or 5
        return numbers.stream()
                .filter(number -> number % 2 == 0 || number % 3 == 0 || number % 5 == 0)
                // Collect the filtered numbers into a new ArrayList
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
