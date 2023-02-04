import java.util.Scanner; // to use scanner

public class Password { // Password class

    public static void main(String[] args) { // main method
        // create reader to take an input
        Scanner reader = new Scanner(System.in);

        // taking input
        System.out.println("Password?");
        String password = reader.nextLine();

        // conditional statements
        if (password.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }

    } // end of main method
} // end of Password class
