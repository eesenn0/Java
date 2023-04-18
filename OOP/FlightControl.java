package flightcontrol;

import java.util.Scanner;
import flightcontrol.ui.TextUI;
import flightcontrol.logic.FlightControlApp;

public class FlightControl {
    
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Create a new instance of the FlightControlApp class
        FlightControlApp flightControl = new FlightControlApp();
        
        // Create a new instance of the TextUI class, passing in the flightControl object and the scanner object
        TextUI ui = new TextUI(flightControl, scanner);     
        
        // Start the user interface
        ui.start();
    }
}
package flightcontrol.domain;

public class Place {
    
    private String ID;
    
    public Place(String ID) {
        // Constructor for the Place class that takes an ID parameter and sets the ID field
        this.ID = ID;
    }
    
    @Override
    public String toString() {
        // Returns the ID of the Place object as a string
        return this.ID;
    }
}
package flightcontrol.domain;

public class Airplane {
    
    private String id;
    private int capacity;
    
    public Airplane(String id, int capacity) {
        // Constructor for the Airplane class that takes an id and capacity parameter and sets the id and capacity fields
        this.id = id;
        this.capacity = capacity;
    }
    
    public String getID() {
        // Returns the id field of the Airplane object
        return this.id;
    }
    
    public int getCapacity() {
        // Returns the capacity field of the Airplane object
        return this.capacity;
    }
    
    @Override
    public String toString() {
        // Returns a string representation of the Airplane object, including the id and capacity fields
        return this.id + " (" + this.capacity + " capacity)";
    }
}
public class Flight {
    
    // Three private fields representing the airplane, departure airport, and target airport of the flight
    private Airplane airplane;
    private Place departureAirport;
    private Place targetAirport;
    
    // A constructor that takes an airplane, departure airport, and target airport, and initializes the fields with them
    public Flight(Airplane airplane, Place departureAirport, Place targetAirport) {
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.targetAirport = targetAirport;
    }
    
    // Getter method for the airplane field
    public Airplane getAirplane() {
        return this.airplane;
    }
    
    // Getter method for the departureAirport field
    public Place getDepartureAirport() {
        return this.departureAirport;                
    }
    
    // Getter method for the targetAirport field
    public Place getTargerAirport() {
        return this.targetAirport;
    }
    
    // Overrides the toString method to return a string representation of the flight
    @Override
    public String toString() {
        return this.airplane.toString() + " (" + this.departureAirport + "-" + 
                this.targetAirport + ")";
    }
}
package flightcontrol.logic;

import java.util.Collection;
import flightcontrol.domain.Flight;
import flightcontrol.domain.Airplane;
import java.util.HashMap;
import java.util.Map;
import flightcontrol.domain.Place;

public class FlightControlApp {
    
    // A HashMap to store airplanes with their IDs as keys
    private HashMap<String, Airplane> airplanes;
    
    // A HashMap to store flights with their IDs as keys
    private HashMap<String, Flight> flights;
    
    // A Map to store places with their IDs as keys
    private Map<String, Place> places;
    
    // Constructor method that initializes the HashMaps
    public FlightControlApp() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }
    
    // Method to add a new airplane to the HashMap
    public void addAirplane(String ID, int capacity) {
        Airplane plane = new Airplane(ID, capacity);
        this.airplanes.put(ID, plane);
    }
    
    // Method to add a new flight to the HashMap
    public void addFlight(Airplane plane, String departureID, String destinationID) {
        // Adds new Place objects to the Map if they don't already exist
        this.places.putIfAbsent(departureID, new Place(departureID));
        this.places.putIfAbsent(destinationID, new Place(destinationID));
        
        // Creates a new Flight object and adds it to the HashMap
        Flight flight = new Flight(plane, this.places.get(departureID), this.places.get(destinationID));
        this.flights.put(flight.toString(), flight);
    }
    
    // Method to retrieve all airplanes in the HashMap
    public Collection<Airplane> getAirplanes() {
        return this.airplanes.values();
    }
    
    // Method to retrieve all flights in the HashMap
    public Collection<Flight> getFlights() {
        return this.flights.values();
    }
    
    // Method to retrieve an airplane by its ID
    public Airplane getAirplane(String ID) {
        return this.airplanes.get(ID);
    }
}
package flightcontrol.ui;

import flightcontrol.domain.Flight;
import flightcontrol.domain.Airplane;
import java.util.Scanner;
import flightcontrol.logic.FlightControlApp;

public class TextUI {

    // class fields
    private FlightControlApp flightControl;
    private Scanner scanner;

    // constructor
    public TextUI(FlightControlApp flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    // method to start the UI
    public void start() {
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println();
    }

    // method to handle the asset control section of the UI
    private void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("---------------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.println("> ");
            String answer = scanner.nextLine();

            // conditionals to handle user input
            if (answer.equals("1")) {
                addAirplane(scanner);
            } else if (answer.equals("2")) {
                addFlight(scanner);
            } else if (answer.equals("x")) {
                break;
            }
        }
    }

    // method to add an airplane to the asset control
    private void addAirplane(Scanner scanner) {
        System.out.println("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.println("Give the airplane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());

        this.flightControl.addAirplane(id, capacity);
    }

    // method to add a flight to the asset control
    private void addFlight(Scanner scanner) {
        System.out.println("Give the airplane id: ");
        Airplane airplane = askForAirplane(scanner);
        System.out.println("Give the departure airport id: ");
        String departureID = scanner.nextLine();
        System.out.println("Give the target airport id: ");
        String destinationID = scanner.nextLine();

        this.flightControl.addFlight(airplane, departureID, destinationID);
    }

    // method to handle the flight control section of the UI
    private void startFlightControl() {
        System.out.println("Flight Control");
        System.out.println("--------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String answer = scanner.nextLine();

            // conditionals to handle user input
            if (answer.equals("1")) {
                printAirplanes();
            } else if (answer.equals("2")) {
                printFlights();
            } else if (answer.equals("3")) {
                printAirplaneDetails();
            } else if (answer.equals("x")) {
                break;
            }
        }
    }

    // method to print the list of airplanes
    private void printAirplanes() {
        for (Airplane plane : flightControl.getAirplanes()) {
            System.out.println(plane);
        }
    }

    // method to print the list of flights
    private void printFlights() {
        for (Flight flight : flightControl.getFlights()) {
            System.out.println(flight);
            System.out.println("");
        }
    }

    // method to print the details of airplanes
    private void printAirplaneDetails() {
        System.out.print("Give the airplane id: ");
        Airplane plane = askForAirplane(scanner);
        System.out.println(plane);
        System.out.println();
    }
    
    private Airplane askForAirplane(Scanner scanner) {
        Airplane airplane = null;
        while (airplane == null) {
            String id = scanner.nextLine();
            airplane = flightControl.getAirplane(id);

            if (airplane == null) {
                System.out.println("No airplane with the id " + id + ".");
            }
        }

        return airplane;
    }
}
