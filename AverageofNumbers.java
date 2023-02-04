import java.util.Scanner; // to use scanner

public class AverageofNumbers { //AverageofNumbers class
  
    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // create scanner to get inputs
        
        System.out.println("Give the first number:"); 
        int first_no = Integer.valueOf(scanner.nextLine()); // first number from user
      
        System.out.println("Give the second number:");
        int second_no = Integer.valueOf(scanner.nextLine()); // second number from user
      
        System.out.println("Give the third number:");
        int third_no = Integer.valueOf(scanner.nextLine()); // third number from user
        
      
        double avg = (first_no + second_no + third_no)/3.0; // average formula
        
        System.out.println("The average is " + avg);
    }
}
