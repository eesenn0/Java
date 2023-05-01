public class JavaApplication1 {

    public static void main(String[] args) {
        // Create an array of integers called "numbers"
        int numbers[] = {3, -1, 8, 4};

        // Call the "sum" method with different sets of parameters and print the result
        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));
    }
    
    // Define a static method named "sum" that takes an array of integers, 
    // a starting index, an ending index, a minimum value, and a maximum value
    public static int sum(int array[], int fromWhere, int toWhere, int smallest, int largest) {
        int sum = 0;
        
        // If the starting index is less than zero, set it to zero
        if (fromWhere < 0) {
            fromWhere = 0;
        }
        
        // If the ending index is greater than the last index in the array, set it to the last index
        if (toWhere > array.length - 1) {
            toWhere = array.length - 1;
        }
        
        // Iterate over the array from the starting index to the ending index
        for (; fromWhere <= toWhere; fromWhere++) {
            // If the current element is between the minimum and maximum values, add it to the sum
            if (array[fromWhere] >= smallest && array[fromWhere] <= largest) {
                sum += array[fromWhere];
            }
        }
        
        // Return the sum of the elements between the starting and ending indices that 
        // fall between the minimum and maximum values
        return sum;
    }

}
