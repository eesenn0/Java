// This is the MainProgram class, which contains the main method that starts the program.
public class MainProgram {

    // The main method, which is the entry point of the program.
    public static void main(String[] args) {
        
        // Creates a new instance of the Fitbyte class with age 30 and resting heart rate 60.
        Fitbyte assistant = new Fitbyte(30, 60);
        
        // Sets the initial target heart rate percentage to 50%.
        double percentage = 0.5;
        
        // Loops through heart rate percentages from 50% to 90%, in increments of 10%.
        while(percentage < 1.0) {
            // Calculates the target heart rate for the current percentage.
            double target = assistant.targetHeartRate(percentage);
            
            // Prints the target heart rate for the current percentage.
            System.out.println("Target " + (percentage * 100) + "% of maximum: "
                    + target);
            
            // Increases the percentage by 10% for the next iteration of the loop.
            percentage += 0.1;
        }
    }   
}

// This is the Fitbyte class, which contains methods for calculating maximum and target heart rates.
class Fitbyte {
    
    // Fields for the age and resting heart rate of a person.
    int age;
    int restingHeartRate;
    
    // Constructor that sets the age and resting heart rate fields.
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    // Method for calculating the maximum heart rate based on age.
    public double maxHeartRate(int age) {
        return 206.3 - (0.711 * age);
    }
    
    // Method for calculating the target heart rate based on a given percentage of the maximum heart rate.
    public double targetHeartRate(double percentageOfMaximum) {
        // Calculates the maximum heart rate based on the person's age.
        double maxHR = maxHeartRate(this.age);
        
        // Calculates the target heart rate based on the maximum heart rate, the person's resting heart rate, and the percentage of maximum.
        double targetHR = (maxHR - restingHeartRate) * percentageOfMaximum + restingHeartRate;
        
        return targetHR;
    }
}

