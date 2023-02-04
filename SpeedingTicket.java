import java.util.Scanner; // to use scanner

public class SpeedingTicket { // SpeedingTicket class
  
    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // create scanner to take input
        
        System.out.println("Give speed:");
        int speed = Integer.valueOf(scanner.nextLine()); // take an input from user
        
        if(speed > 120) { // conditional statement
            System.out.println("Speeding ticket!");
        } // end of conditional statement
    } // end of main method
} // end of  SpeedingTicket class
