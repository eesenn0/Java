import java.util.Scanner; // to use scanner

public class ConvertDaystoSeconds { // ConvertDaystoSeconds class
  
    public static void main(String[] args) { // main method
        // create scanner to take a input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many days would you like to convert to a seconds?");
        // changing data type string to integer
        int days = Integer.valueOf(scanner.nextLine());
        // 1 day = 86400 seconds
        int seconds = days * 86400;
        System.out.println(seconds); //print
    } // end of main method
} // end of ConvertDaystoSeconds class
