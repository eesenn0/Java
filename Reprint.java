import java.util.Scanner; // to use scanner

public class Reprint { // Reprint class

    public static void main(String[] args) { // main method
        // create scanner to take an input
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");
        int times = Integer.parseInt(scanner.nextLine());

        // initialize i
        int i = 0;

        // conditional statement
        while (i < times) {
            livedMethod();
            i++;
        }
    } // end of main method

    public static void livedMethod() { // livedMethod method
        System.out.println("In a hole in the ground there lived a method");
    } // end of livedMethod method
} // end of Reprint class
