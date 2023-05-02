import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Define the magic square as a 2D array
        int[][] square = {
            {8, 1, 6}, 
            {3, 5, 7}, 
            {4, 9, 2}
        };
        
        // Create a new MagicSquare object with the given square
        MagicSquare magicSquare = new MagicSquare(square);
        
        // Calculate the sums of the columns in the square
        ArrayList<Integer> columnSums = magicSquare.sumsOfColumns();
        
        // Print out the column sums
        System.out.println(columnSums); 
    }
}

class MagicSquare {
    
    // Declare the 2D array that represents the magic square
    private int square[][];
    
    // Constructor that takes a 2D array as input and initializes the MagicSquare object
    public MagicSquare(int square[][]) {
        this.square = square;
    }
    
    // Method that calculates the sums of the rows in the magic square
    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> rowSums = new ArrayList<>();
        for (int i = 0; i < square.length; i++) {
            int sum = 0;
            for (int j = 0; j < square[i].length; j++) {
                // Sum the values in the current row
                sum += square[i][j];
            }
            // Add the row sum to the list of row sums
            rowSums.add(sum);
        }
        // Return the list of row sums
        return rowSums;
    }
    
    // Method that calculates the sums of the columns in the magic square
    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> columnSums = new ArrayList<>();
        for (int i = 0; i < square.length; i++) {
            int sum = 0;
            for (int j = 0; j < square[i].length; j++) {
                // Sum the values in the current column
                sum += square[j][i];
            }
            // Add the column sum to the list of column sums
            columnSums.add(sum);
        }
        // Return the list of column sums
        return columnSums;
    }
}
