// Import necessary Java classes
package javaapplication1;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

// Define the main class
public class JavaApplication1 {

    // Define class-level variables for the number of games played, won, and lost
    private static int count = 0, wins = 0, losses = 0;

    // Define the main method, which is where the program starts
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scan = new Scanner(System.in);

        // Ask the user for the name of the file to read data from
        System.out.println("File: ");
        String file = scan.nextLine();

        // Read the game records from the file and store them in an ArrayList
        ArrayList<Team> records = readRecordsFromFile(file);

        // If an error occurred while reading the file, exit the program
        if (records == null) {
            System.out.println("An error occurred while reading the file.");
            return;
        }

        // Ask the user for the name of the team to search for
        System.out.println("Team: ");
        String teamName = scan.nextLine();

        // Loop through the game records and update the win/loss count for the specified team
        for (Team team : records) {
            if (team.getHomeTeam().contains(teamName)) {
                count++;
                if (team.getHomeScore() >= team.getAwayScore()) {
                    wins++;
                    team.setWins();
                } else {
                    losses++;
                    team.setLosses();
                }
            } else if (team.getAwayTeam().contains(teamName)) {
                count++;
                if (team.getAwayScore() >= team.getHomeScore()) {
                    wins++;
                    team.setWins();
                } else {
                    losses++;
                    team.setLosses();
                }
            }
        }

        // Print the final results (number of games played, won, and lost) to the console
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    // Define a method to read game records from a file and return them as an ArrayList
    public static ArrayList<Team> readRecordsFromFile(String file) {

        // Create a new ArrayList to store the game records
        ArrayList<Team> teams = new ArrayList<>();

        // Define some variables for reading the file
        String line, homeTeam, awayTeam;
        String parts[];
        int homeScore, awayScore;

        try {
            // Create a Scanner object to read the file
            Scanner scanner = new Scanner(Paths.get(file));

            // Loop through each line in the file
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();

                // Split the line into its parts (home team, away team, home score, away score)
                parts = line.split(",");

                // Parse the parts and store them in local variables
                homeTeam = parts[0];
                awayTeam = parts[1];
                homeScore = Integer.parseInt(parts[2]);
                awayScore = Integer.parseInt(parts[3]);

                // Create a new Team object and add it to the ArrayList
                teams.add(new Team(homeTeam, awayTeam, homeScore, awayScore));
            }
        } catch (IOException ex) {
            // If an error occurred while reading the file, return null
            System.out.println("An error occurred while reading the file.");
            return null;
        }

        // Return the ArrayList of game records
        return teams;
    }

    static class Team {
        
        // Instance variables for the home team name, away team name, 
        // home team score, away team score, number of wins, and number of losses.
        String homeTeam, awayTeam;
        int homeScore, awayScore, wins, losses;
        
        // Constructor method for creating a new team with given information.
        public Team(String homeTeam, String awayTeam, int homeScore, int awayScore) {
            this.homeTeam = homeTeam;
            this.awayTeam = awayTeam;
            this.homeScore = homeScore;
            this.awayScore = awayScore;
        }

        // Getter methods for accessing the instance variables.
        public String getHomeTeam() {
            return homeTeam;
        }

        public String getAwayTeam() {
            return awayTeam;
        }

        public int getHomeScore() {
            return homeScore;
        }

        public int getAwayScore() {
            return awayScore;
        }
        
        // Methods for updating the number of wins and losses for the team.
        public int setWins() {
            return wins += 1;
        }

        public int setLosses() {
            return losses += 1;
        }
    }
}
