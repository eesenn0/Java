import java.util.Scanner; // to use scanner

public class Counting { // Counting class

    public static void main(String[] args) { // main method

        // creating scanner to take an input
        Scanner scanner = new Scanner(System.in);
        
        double number = Integer.parseInt(scanner.nextLine());
        
        // for loop
        for(int i = 0; i <= number; i++){
            // print outputs
            System.out.println(i);
        }
    } // end of main method
} // end of Counting class
