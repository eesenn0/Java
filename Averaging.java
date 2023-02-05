import java.util.Scanner; // to use scanner

public class Averaging { // Averaging class

    public static void main(String[] args) { // main method
        // create scanner to take inputs
        Scanner scanner = new Scanner(System.in);

        // taking four numbers from user
        System.out.println("Enter four numbers:");
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        int number4 = Integer.parseInt(scanner.nextLine());

        // invoking add method
        int add = sum(number1, number2, number3, number4);
        // invoking average method
        double result = average(add);
        // print the result
        System.out.println("Average: " + result);
    } // end main method

    public static int sum(int no1, int no2, int no3, int no4) { // sum method
        return no1 + no2 + no3 + no4; // return int value
    } // end sum method

    public static double average(int addition) { // average method
        return (double) addition / 4; // return double value
    } // end average method
} // end Averaging class
