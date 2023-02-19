public class Clock {
    // Define a class for a clock

    public static void main(String[] args) {
        // Create new ClockHand objects for the hours, minutes, and seconds
        ClockHand hours = new ClockHand(24);
        ClockHand minutes = new ClockHand(60);
        ClockHand seconds = new ClockHand(60);

        while (true) {
            // 1. Print the time
            System.out.println(hours + ":" + minutes + ":" + seconds);

            // 2. Advancing the second hand
            seconds.advance();

            // 3. Advancing the other hands when required
            if (seconds.value() == 0) {
                minutes.advance();

                if (minutes.value() == 0) {
                    hours.advance();
                }
            }
        }
    }
}

class ClockHand {
    // Define a class for a clock hand

    private int value; // The current value of the clock hand
    private final int limit; // The maximum value of the clock hand

    public ClockHand(int limit) {
        // Constructor that sets the maximum value and initializes 
        // the current value to 0
        this.limit = limit;
        this.value = 0;
    }

    public void advance() {
        // Method that increments the value of the clock hand by 1 and 
        // resets it to 0 if it exceeds the limit
        this.value += 1;

        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    public int value() {
        // Method that returns the current value of the clock hand
        return this.value;
    }

    @Override
    public String toString() {
        // Method that returns a string representation of the clock hand value
        if (this.value < 10) {
            // If the value is less than 10, add a leading 0 to the string representation
            return "0" + this.value;
        }

        // Otherwise, just return the string representation of the value
        return "" + this.value;
    }
}
