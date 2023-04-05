import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainProgram {

    public static void main(String[] args) {
        // Create a new ArrayList of integers
        List<Integer> list = new ArrayList<>();

        // Add some values to the list
        list.add(1);
        list.add(2);
        list.add(-1);

        // Call the 'positive' method to get a new list of positive integers
        List<Integer> positives = positive(list);

        // Print out the new list of positive integers
        System.out.println(positives);
    }

    public static List<Integer> positive(List<Integer> numbers) {
        // Use the 'stream' method to filter out negative values
        List<Integer> positives = numbers.stream()
                .filter(value -> value > 0)
                
                // Collect the filtered values into a new list
                // Use 'collectingAndThen' to perform an additional operation
                .collect(Collectors.collectingAndThen(Collectors.toList(), 
                        
                        // Create a new ArrayList based on the collected values
                        list -> new ArrayList<>(list)));
        
        // Return the new list of positive integers
        return positives;
    }
}
