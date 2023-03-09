import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // create an instance of JokeManager class and Scanner class
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);

        // create an instance of UserInterface class and start it
        UserInterface ui = new UserInterface(manager, scanner);
        ui.start();
    }

}

import java.util.ArrayList;
import java.util.Random;

class JokeManager {

    // instance variables to hold the list of jokes and a random number generator
    private ArrayList<String> jokes;
    private Random random;

    public JokeManager() {
        // constructor to initialize the instance variables
        this.jokes = new ArrayList<>();
        this.random = new Random();
    }

    public void addJoke(String joke) {
        // add a new joke to the list of jokes
        this.jokes.add(joke);
    }

    public String drawJokes() {
        // return a random joke from the list of jokes
        int index = random.nextInt(jokes.size());        
        
        return jokes.get(index);
    }

    public void printJokes() {
        // print all the jokes in the list of jokes
        for(String joke : jokes) {
            System.out.println(joke);
        }
    }
}

import java.util.Scanner;

class UserInterface {
    // instance variables to hold JokeManager and Scanner instances
    private JokeManager jokemanager;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokemanager, Scanner scanner) {
        // constructor to initialize the instance variables
        this.jokemanager = jokemanager;
        this.scanner = scanner;
    }
    
    public void start() {
        // loop to display menu and read user input until user enters 'X'
        while(true) {
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String command = scanner.nextLine();
            
            if(command.equals("1")) {
                // read a new joke from user and add it to JokeManager
                System.out.println("Write the joke to be added: ");
                String joke = scanner.nextLine();
                
                jokemanager.addJoke(joke);
            }
            
            else if(command.equals("2")) {
                // draw a random joke from JokeManager and print it
                String joke = jokemanager.drawJokes();
                System.out.println(joke);
            }
            
            else if(command.equals("3")) {
                // print all the jokes in JokeManager
                System.out.println("Printing the jokes.");
                jokemanager.printJokes();
            }
            
            else if(command.equals("X")) {
                // exit the loop and stop the program
                break;
            }            
        }       
    }
}
