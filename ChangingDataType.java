import java.util.Scanner; // to use scanner

public class ChangingDataType { // ChangingDataType class
  
    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // create scanner
        
        System.out.println("Give a string"); 
        String string0 = scanner.nextLine(); // take a string input
        
        System.out.println("Give an integer");
        int integer0 = Integer.valueOf(scanner.nextLine()); // convert the string to an integer type
        
        System.out.println("Give a double");
        double double0 = Double.valueOf(scanner.nextLine()); // convert the string to a double type
        
        System.out.println("Give a boolean");
        boolean boolean0 = Boolean.valueOf(scanner.nextLine()); // convert the string to a boolean
        
        // print all of the inputs
        System.out.println("You gave the string: " + string0);
        System.out.println("You gave the integer: " + integer0);
        System.out.println("You gave the double: " + double0);
        System.out.println("You gave the booelan: " + boolean0);
      
    } // end of main
} // end of ChangingDataType class
