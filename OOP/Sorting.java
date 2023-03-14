import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int numbers[] = {6, 5, 8, 7, 11};

        // Find the smallest value in the array
        int smallestValue = Sorting.smallest(numbers);
        System.out.println("Smallest: " + smallestValue);

        // Find the index of the smallest value in the array
        int indexSmallest = Sorting.indexOfSmallest(numbers);
        System.out.println("Index of smallest number: " + indexSmallest);

        // Find the index of the smallest value in the array starting from a given index
        System.out.println(Sorting.IndexOfSmallestFrom(numbers, 0));
        System.out.println(Sorting.IndexOfSmallestFrom(numbers, 1));
        System.out.println(Sorting.IndexOfSmallestFrom(numbers, 2));

        // Print the array
        System.out.println(Arrays.toString(numbers));

        // Swap the elements at the given indices in the array
        Sorting.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        Sorting.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
        
        // Sort the array in ascending order
        System.out.println();
        Sorting.sort(numbers);        
    }
}

class Sorting {

    // Find the smallest value in the array
    public static int smallest(int array[]) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int smallestValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestValue) {
                smallestValue = array[i];
            }
        }

        return smallestValue;
    }

    // Find the index of the smallest value in the array
    public static int indexOfSmallest(int array[]) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int indexSmallest = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == Sorting.smallest(array)) {
                indexSmallest = i; 
            }
        }

        return indexSmallest;
    }

    // Find the index of the smallest value in the array starting from a given index
    public static int IndexOfSmallestFrom(int table[], int startIndex) {
        if (table == null || table.length == 0) {
            return -1;
        }

        int smallestFrom = table[startIndex];

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallestFrom) {
                smallestFrom = table[i];
            }
        }

        return smallestFrom;
    }

    // Swap the elements at the given indices in the array
    public static void swap(int array[], int index1, int index2) {
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
    }
    
    // Sort the array in ascending order using bubble sort algorithm
    public static void sort(int array[]) {        
        for(int i = 0; i < array.length - 1; i++) {                            
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]) {                    
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    // Print the array at each iteration of inner loop
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }
}
