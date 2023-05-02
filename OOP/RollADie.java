import java.util.Random;

public class Die {
    
    private Random random; // A private instance variable to generate random numbers
    private int numberOfFaces; // A private instance variable to store the number of faces on the die
    
    // A constructor that initializes the instance variables
    public Die(int numberOfFaces) {
        this.random = new Random();
        this.numberOfFaces = numberOfFaces;
    }
    
    // A method that "throws" the die and returns a random integer between 1 and the number of faces
    public int throwDie() {
        int number = random.nextInt(this.numberOfFaces) + 1;
        return number;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creates a new Die object with 6 faces
        Die die = new Die(6);
        
        // Rolls the die 10 times and prints the result each time
        for (int i = 0; i < 10; i++) {
            System.out.println(die.throwDie());
        }
    }
}
