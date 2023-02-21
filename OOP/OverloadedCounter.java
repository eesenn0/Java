public class MainProgram {
    
    // main method where the program starts executing
    public static void main(String[] args) {
        
        // creating two Counter objects using different constructors
        Counter first = new Counter();
        Counter second = new Counter(5);
        
        // printing the initial values of the counters
        System.out.println("Beginning of the first number: " + first.getNumber());
        System.out.println("Beginning of the first number: " + second.getNumber());
        
        // printing an empty line for formatting purposes
        System.out.println("");
                
        // increasing the value of the first counter by 4 and printing the result
        first.increase(4);
        System.out.println("First number: " + first.getNumber());
        
        // decreasing the value of the second counter by 4 and printing the result
        second.decrease(4);
        System.out.println("Second number: " + second.getNumber());
        
        // printing an empty line for formatting purposes
        System.out.println("");
        
        // increasing the value of the first counter by 1 and printing the result
        first.increase();
        System.out.println("First Number: " + first.getNumber());
        
        // decreasing the value of the second counter by 1 and printing the result
        second.decrease();
        System.out.println("Second Number: " + second.getNumber());
    }
}

// Counter class that represents a counter with a numeric value
class Counter {
    
    // private instance variable that holds the numeric value of the counter
    private int number;
    
    // constructor that takes a starting value for the counter
    public Counter(int startValue) {
        this.number = startValue;
    }
    
    // default constructor that initializes the counter to 0
    public Counter() {
        this(0);
    }
    
    // method that returns the current value of the counter
    public int value() {
        return this.number;
    }
    
    // method that increases the counter value by 1
    public void increase() {
        this.number += 1;
    }
    
    // method that increases the counter value by a given amount
    public void increase(int increaseBy) {
        this.number += increaseBy;
    }
    
    // method that decreases the counter value by 1
    public void decrease() {
        this.number -= 1;
    }
    
    // method that decreases the counter value by a given amount
    public void decrease(int decreaseBy) {
        this.number -= decreaseBy;
    }
    
    // method that returns the current value of the counter
    public int getNumber() {
        return this.number;
    }
    
    // override of the toString method to return a string representation of the object
    @Override
    public String toString() {
        return "number: " + this.number;
    }
}
