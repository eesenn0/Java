public class MainProgram {

    public static void main(String[] args) {
        // Create a new Stack object called 's'
        Stack s = new Stack();

        // Print whether the stack is empty or not (should be true)
        System.out.println(s.isEmpty());
        
        // Print the values currently in the stack (should be an empty list)
        System.out.println(s.values());
        
        // Add a new value to the stack
        s.add("Value");
        
        // Print whether the stack is empty or not (should be false)
        System.out.println(s.isEmpty());
        
        // Print the values currently in the stack (should have one value, "Value")
        System.out.println(s.values());
        
        // Take the last value added to the stack and print it
        String taken = s.take();
        System.out.println(taken);
        
        // Print whether the stack is empty or not (should be true)
        System.out.println(s.isEmpty());
        
        // Print the values currently in the stack (should be an empty list)
        System.out.println(s.values());
        
        // Add five new values to the stack
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");
        
        // Print and remove values from the stack until it is empty (should print 5, 4, 3, 2, 1)
        while(!s.isEmpty()) {
            System.out.println(s.take());
        }
    }

}

import java.util.ArrayList;

class Stack {
    // Declare a private ArrayList called 'stack' to store the values in the stack
    private ArrayList<String> stack;
    
    // Constructor for the Stack class that initializes an empty ArrayList called 'stack'
    public Stack() {
        this.stack = new ArrayList<>();
    }
    
    // Check if the stack is empty and return true if it is, false if it's not
    public boolean isEmpty() {
        if(stack.isEmpty()) {
            return true;
        }
        
        return false;
    }
    
    // Add a new value to the stack
    public void add(String value) {
        stack.add(value);
    }
    
    // Print all values in the stack and return the ArrayList
    public ArrayList<String> values() {
        for(String value : stack) {
            System.out.println(value);
        }
        
        return stack;
    }
    
    // Remove the last value added to the stack and return it
    public String take() {      
        String last;
        
        last = stack.get(stack.size() - 1);                
        stack.remove(stack.size() - 1);
        
        return last;
    }
}
