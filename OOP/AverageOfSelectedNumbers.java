import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainProgram06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        // Prompt the user to input numbers until they enter 'end'
        System.out.println("Input numbers, type 'end' to stop.");
        while (true) {
            String input = scanner.nextLine();

            // If the user enters 'end', stop prompting for input
            if (input.equals("end")) {
                break;
            }

            // Add the user's input to the list
            list.add(input);
        }

        // Prompt the user to choose whether to print the average of the negative or positive numbers
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");

        // Get the user's decision
        String decision = scanner.nextLine();

        if (decision.equals("n")) {
            // Create a new list with the negative numbers from the input list
            List<Integer> negatives = list.stream()
                    .map(n -> Integer.parseInt(n))  // Convert each string to an integer
                    .filter(s -> (s < 0))  // Filter out any positive numbers
                    .collect(Collectors.toList());

            // Calculate the average of the negative numbers and print it
            double average = negatives.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .getAsDouble();

            System.out.println("Average of the negative numbers: " + average);
        } else if (decision.equals("p")) {
            // Create a new list with the positive numbers from the input list
            List<Integer> positives = list.stream()
                    .map(p -> Integer.parseInt(p))  // Convert each string to an integer
                    .filter(p -> (p > 0))  // Filter out any negative numbers
                    .collect(Collectors.toList());

            // Calculate the average of the positive numbers and print it
            double average = positives.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .getAsDouble();

            System.out.println("Average of the positive numbers: " + average);
        }
    }

}
