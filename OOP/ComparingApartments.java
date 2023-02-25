// Importing the static abs method from the Math class
import static java.lang.Math.abs;

// The main class of the program
public class MainProgram2 {

    // The main method that will be executed when the program starts
    public static void main(String[] args) {

        // Creating three Apartment objects with different parameters
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        // Printing whether manhattanStudioApt is larger than atlantaTwoBedroomApt
        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));
        // Printing whether bangorThreeBedroomApt is larger than atlantaTwoBedroomApt
        System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));

        // Printing the price difference between manhattanStudioApt and atlantaTwoBedroomApt
        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));
        // Printing the price difference between bangorThreeBedroomApt and atlantaTwoBedroomApt
        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));

        // Printing whether manhattanStudioApt is more expensive than atlantaTwoBedroomApt
        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));
        // Printing whether bangorThreeBedroomApt is more expensive than atlantaTwoBedroomApt
        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));
    }
}

// The Apartment class
class Apartment {

    // Declaring the private fields of the Apartment class
    private int rooms;
    private int squares;
    private int pricePerSquare;

    // The constructor method of the Apartment class
    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    // A method that returns true if the current apartment is larger than the compared apartment
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        // If the current apartment is not larger than the compared apartment, return false
        return false;
    }   
    
    // A method that calculates and returns the price difference between the current and compared apartment
    public int priceDifference(Apartment compared) {
        return abs(this.squares * this.pricePerSquare - compared.squares * compared.pricePerSquare);
    }
    
    // A method that returns true if the current apartment is more expensive than the compared apartment
    public boolean moreExpensiveThan(Apartment compared) {
        if(this.squares * this.pricePerSquare > compared.squares * compared.pricePerSquare) {
            return true;
        }
        // If the current apartment is not more expensive than the compared apartment, return false
        return false;
    }
}
