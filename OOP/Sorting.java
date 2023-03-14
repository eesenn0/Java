public class Main {
    
    public static void main(String[] args) {
        // Create an array of integers
        int numbers[] = {6, 5, 8, 7, 11};
        
        // Call the smallest method in the Sorting class and store the result in smallestValue
        int smallestValue = Sorting.smallest(numbers);
        
        // Print the smallest value to the console
        System.out.println("Smallest: " + smallestValue);
    }
}

class Sorting {
    
    public static int smallest(int array[]) {
        // Check if the input array is empty or null
        if (array == null || array.length == 0) {
            return -1; // Return -1 if the array is empty or null
        }

        // Set the initial smallest value to the first element in the array
        int smallestValue = array[0];
        
        // Loop through the rest of the array, comparing each element to the current smallest value and updating it if a smaller value is found
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestValue) {
                smallestValue = array[i];
            }
        }

        // Return the smallest value found
        return smallestValue;
    }
}
