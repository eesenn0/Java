import java.util.Scanner; // to use scanner

public class AddTwoNumbers { // class of AddTwoNumbers
  
    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // create scanner to take inputs
        
        // take inputs as integers
        System.out.println("Give the first number:");
        int first_no = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second_no = Integer.valueOf(scanner.nextLine());
        // adding the numbers
        int sum = first_no + second_no;
        
        System.out.println("The sum of the numbers is " + sum);
    } // end of main
} // end of AddTwoNumbers
