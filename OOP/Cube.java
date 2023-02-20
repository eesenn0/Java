// This is the main class that contains the entry point for the program.
public class MainProgram {

    // This is the main method that will be executed when the program is run.
    public static void main(String[] args) {
    
        // Create a new Cube object called oSheaJackson with side length 4.
        Cube oSheaJackson = new Cube(4);
        
        // Print the volume of the oSheaJackson cube using the volume() method.
        System.out.println(oSheaJackson.volume());
        
        // Print a string representation of the oSheaJackson cube using the toString() method.
        System.out.println(oSheaJackson);
        
        // Print a blank line for formatting purposes.
        System.out.println();
        
        // Create a new Cube object called salt with side length 2.
        Cube salt = new Cube(2);
        
        // Print the volume of the salt cube using the volume() method.
        System.out.println(salt.volume());
        
        // Print a string representation of the salt cube using the toString() method.
        System.out.println(salt);        
    }
}
// This is a class called Cube that represents a 3D cube with a fixed edge length.
class Cube {
    
    // This is an instance variable that stores the length of the edge of the cube.
    int length;
    
    // This is a constructor method that initializes the Cube object with a given edge length.
    public Cube(int edgeLength) {
        // Set the length instance variable to the value of the edgeLength parameter.
        this.length = edgeLength;
    }
    
    // This is a method that calculates and returns the volume of the Cube object.
    public int volume() {
        // The volume of a cube is the edge length cubed.
        return this.length * this.length * this.length;
    }
    
    // This is a method that returns a string representation of the Cube object.
    public String toString() {
        // Create a string that includes the length of the edge and the volume of the cube.
        String text = "The length of the edge is " + this.length + " and the "
                + "volume " + volume();
        
        // Return the string.
        return text;
    }
}
