public class Main { // Main method

    public static void main(String[] args) { // Main method 
        // Create an instance of the Gauge class
        Gauge g = new Gauge();

        // Loop until the gauge is full
        while (!g.full()) {
            // Print the current value of the gauge and that it's not full
            System.out.println("Not full! Value: " + g.value());
            // Increase the value of the gauge
            g.increase();
        }

        // Print the current value of the gauge and that it's full
        System.out.println("Full! Value: " + g.value());
        // Decrease the value of the gauge
        g.decrease();
        // Print the current value of the gauge and that it's not full
        System.out.println("Not full! Value: " + g.value());
    } // End main method
} // End Main class

class Gauge { // Gauge class

    // Private instance variable
    private int value;

    // Default constructor
    public Gauge() {
        value = 0;
    }

    // This method increases the value of the gauge by 1, if it's less than 5
    public void increase() {
        if (value < 5) {
            value++;
        }
    }

    // This method decreases the value of the gauge by 1, if it's greater than 0
    public void decrease() {
        if (value > 0) {
            value--;
        }
    }

    // This method returns the current value of the gauge
    public int value() {
        return value;
    }

    // This method returns true if the value of the gauge is equal to 5, false otherwise
    public boolean full() {
        if (value == 5) {
            return true;
        }
        return false;
    } 
} // End Gauge class
