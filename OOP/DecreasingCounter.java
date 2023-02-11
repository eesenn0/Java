// defines the Main class
public class Main {

    // main method
    public static void main(String[] args) {
        // Create a DecreasingCounter object with an initial value of 2
        DecreasingCounter counter = new DecreasingCounter(2);

        // Print the current value of the counter
        counter.printValue();

        // Reset the value of the counter to 0
        counter.reset();
        // Print the current value of the counter
        counter.printValue();

        // Decrement the value of the counter by 1
        counter.decrement();
        // Print the current value of the counter
        counter.printValue();
    }
}

// DecreasingCounter class
class DecreasingCounter {

    // an instance variable
    private int value;

    // constructor
    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    // prints the current value of the counter to the console
    public void printValue() {
        System.out.println("value: " + this.value);
    }

    // decrements the value of the counter by 1, if it's greater than 0
    public void decrement() {
        if (this.value > 0) {
            this.value -= 1;
        }
    }

    // resets the value of the counter to 0
    public void reset() {
        this.value = 0;
    }

}
