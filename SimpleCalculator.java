import java.util.Scanner; // to use scanner

public class SimpleCalculator { // SimpleCalculator class
  
    public static void main(String[] args) { // main method
      
        Scanner scanner = new Scanner(System.in); // create scanner to take inputs
        
        System.out.println("Give the first number:");
        int first_no = Integer.valueOf(scanner.nextLine()); // first number
      
        System.out.println("Give the second number:");
        int second_no = Integer.valueOf(scanner.nextLine()); // second number
        
        int sum = first_no + second_no; // "+" operation
        int subtract = first_no - second_no; // "-" operation
        int mult = first_no * second_no; // "*" operation
        double divide = (double) first_no / second_no; // "/" operation
        
        System.out.println(first_no + " + " + second_no + " = " + sum); // print addition
        System.out.println(first_no + " - " + second_no + " = " + subtract); // print subtraction
        System.out.println(first_no + " * " + second_no + " = " + mult); // print multiplication
        System.out.println(first_no + " / " + second_no + " = " + divide); // print divide
    } // end of main method
} // end of SimpleCalculator class
