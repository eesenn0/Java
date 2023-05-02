public class JavaApplication1 {

    public static void main(String[] args) {
        // create a 2-dimensional array of integers
        int[][] matrix = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };
        // print the array as a string using the arrayAsString method
        System.out.println(arrayAsString(matrix));
    }

    public static String arrayAsString(int array[][]) {
        // create a StringBuilder object to build the string representation of the array
        StringBuilder sb = new StringBuilder();
        // loop over each row in the array
        for (int i = 0; i < array.length; i++) {
            // loop over each element in the current row
            for (int j = 0; j < array[i].length; j++) {
                // append the current element to the StringBuilder
                sb.append(array[i][j]);
            }            
            // append a newline character to separate rows in the output
            sb.append("\n");
        }
        // return the final string representation of the array
        return sb.toString();
    }
}
