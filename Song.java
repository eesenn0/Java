// Define a public class named MainProgram
public class MainProgram {

    // Define a static method named main that takes an array of Strings as input
    public static void main(String[] args) {
        
        // Create a new instance of the Song class with the given parameters
        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        
        // Create another instance of the Song class with the same parameters as the first
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        
        // Check if the two Song objects are equal using the equals() method
        if(jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }
        
        // Check if the first Song object is equal to a String object using the equals() method
        if(jackSparrow.equals("Another object")) {
            System.out.println("Strange things are afoot.");
        }
                
    }
    
}

// Define a Song class
class Song {
    
    // Define three private instance variables for the class
    private String song;
    private String name;
    private int number;
    
    // Define a constructor that takes three parameters and initializes the instance variables
    public Song(String song, String name, int number) {
        this.song = song;
        this.name = name;
        this.number = number;
    }
    
    // Define an equals() method that overrides the default equals() method for comparing objects
    public boolean equals(Object compared) {
        
        // Check if the two objects are the same instance
        if(this == compared) {
            return true;
        }
        
        // Check if the compared object is an instance of the Song class
        if(!(compared instanceof Song)) {
            return false;
        }
        
        // Convert the compared object to a Song object for comparison
        Song comparedSong = (Song) compared;
        
        // Check if the instance variables for the two Song objects are equal
        if(this.song == comparedSong.song && this.name == comparedSong.name && 
                this.number == comparedSong.number) {
            return true;
        }
        
        // Return false if the objects are not equal
        return false;
    }
}
