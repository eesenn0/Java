public class Main { // Main class

    public static void main(String[] args) { // Main method
        // Create an instance
        Multiplier multiplyByThree = new Multiplier(3);

        // Print the result of multiplying 2 by 3
        System.out.println("multiplyByThree.multiply(2): " + multiplyByThree.multiply(2));

        // Create an instance
        Multiplier multiplyByFour = new Multiplier(4);

        // Print the result of multiplying 2 by 4
        System.out.println("multiplyByFour.multiply(2): " + multiplyByFour.multiply(2));
        
        // Print the result of multiplying 1 by 3
        System.out.println("multiplyByThree.multiply(1): " + multiplyByThree.multiply(1));
        
        // Print the result of multiplying 1 by 4
        System.out.println("multiplyByFour.multiply(1): " + multiplyByFour.multiply(1));
    } // End main method
} // End Main class

class Multiplier { // Multiplier class

    int number;

    // Constructor for Multiplier class
    public Multiplier(int number) {

        this.number = number;
    }

    // Method to multiply a given number by the factor stored
    public int multiply(int number) {

        return number * this.number;
    }

}
