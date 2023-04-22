public class Main {
  
    public static void main(String[] args) {
        // Create three instances of the TemperatureSensor class and assign them to variables
        Sensor kumpula = new TemperatureSensor();
        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        // Create an instance of the AverageSensor class and assign it to a variable
        AverageSensor helsinkiRegion = new AverageSensor();

        // Add the three TemperatureSensor instances as sensors to the AverageSensor instance
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        // Turn on the AverageSensor instance
        helsinkiRegion.setOn();

        // Print the temperature in the Helsinki region as read by the AverageSensor instance three times
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
    }
}
// Define an interface called "Sensor"
public interface Sensor {
    // Define a method called "isOn" that returns a boolean value
    boolean isOn();
    
    // Define a method called "setOn" that takes no arguments and returns void
    void setOn();
    
    // Define a method called "setOff" that takes no arguments and returns void
    void setOff();
    
    // Define a method called "read" that returns an integer value
    int read();
}

// Define a class called "StandardSensor" that implements the "Sensor" interface
public class StandardSensor implements Sensor {
    
    // Define an instance variable called "number"
    public int number;
    
    // Define a constructor that takes an integer argument and assigns it to the "number" variable
    public StandardSensor(int number) {
        this.number = number;
    }
    
    // Implement the "isOn" method of the "Sensor" interface
    @Override
    public boolean isOn() {
        return true;
    }

    // Implement the "setOn" method of the "Sensor" interface
    @Override
    public void setOn() {
        // Do nothing in this implementation
    }

    // Implement the "setOff" method of the "Sensor" interface
    @Override
    public void setOff() {
        // Do nothing in this implementation
    }

    // Implement the "read" method of the "Sensor" interface
    @Override
    public int read() {
        return this.number;
    }
}
import java.util.Random;

// Define a class called "TemperatureSensor" that implements the "Sensor" interface
public class TemperatureSensor implements Sensor {
    
    // Define instance variables called "isOn" and "random"
    private boolean isOn;
    private Random random = new Random();
    
    // Define a constructor that takes no arguments
    public TemperatureSensor() {       
    }
    
    // Implement the "isOn" method of the "Sensor" interface
    @Override
    public boolean isOn() {
        return isOn;
    }

    // Implement the "setOn" method of the "Sensor" interface
    @Override
    public void setOn() {
        isOn = true;
    }

    // Implement the "setOff" method of the "Sensor" interface
    @Override
    public void setOff() {
        isOn = false;
    }

    // Implement the "read" method of the "Sensor" interface
    @Override
    public int read() {        
        int randNo = 0;
        
        // If the sensor is off, throw an exception
        if (!isOn) {
            throw new IllegalStateException("Sensor is closed.");
        }
        
        // If the sensor is on, generate a random temperature reading between -30 and 30 degrees Celsius
        if (isOn) {
            randNo = random.nextInt(61) - 30;            
        }
        
        return randNo;
    }
}
import java.util.ArrayList;
import java.util.List;

// Define a class called "AverageSensor" that implements the "Sensor" interface
public class AverageSensor implements Sensor {

    // Define instance variables called "isOn", "sensors", and "readings"
    private boolean isOn;
    private List<Sensor> sensors;
    private List<Integer> readings;

    // Define a constructor that initializes the "sensors" and "readings" lists
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    // Add a new sensor to the list of sensors
    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    // Implement the "isOn" method of the "Sensor" interface
    @Override
    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }

        return true;
    }

    // Implement the "setOn" method of the "Sensor" interface
    @Override
    public void setOn() {
        for (Sensor sensor : this.sensors) {
            sensor.setOn();
        }
        isOn = true;
    }

    // Implement the "setOff" method of the "Sensor" interface
    @Override
    public void setOff() {
        for (Sensor sensor : this.sensors) {
            sensor.setOff();
        }
        isOn = false;
    }

    // Implement the "read" method of the "Sensor" interface
    @Override
    public int read() {
        if (!isOn) {
            throw new IllegalStateException("Sensor is closed.");
        }

        int sum = 0;

        // Iterate over all sensors, read the temperature, and add it to the sum
        for (Sensor sensor : sensors) {
            sum += sensor.read();
        }

        // Calculate and return the average temperature
        return sum / sensors.size();
    }

}
