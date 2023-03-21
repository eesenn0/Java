import java.util.HashMap;

public class JavaApplication42 {

    public static void main(String[] args) {
        // Create a new instance of the Abbreviations class
        Abbreviations abbreviations = new Abbreviations();
        
        // Add some abbreviations to the abbreviations hashmap
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");
        
        // A sample text to be parsed
        String text = "e.g. i.e. etc. lol";
        
        // Loop through each word in the text
        for (String part : text.split(" ")) {
            // If the word is an abbreviation, replace it with its corresponding explanation
            if (abbreviations.hasAbbrevation(part)) {
                part = abbreviations.findExplanationFor(part);
            }
            
            // Print the word/explanation
            System.out.print(part);
            System.out.print(" ");
        }
        
        System.out.println(); // Print a new line
    }
    
}

class Abbreviations {
    private HashMap<String, String> abbreviations;
    
    // Constructor to initialize the abbreviations hashmap
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }
    
    // Method to add a new abbreviation to the hashmap
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviations.put(abbreviation, explanation);
    }
    
    // Method to check if an abbreviation is present in the hashmap
    public boolean hasAbbrevation(String abbreviation) {
        return abbreviations.containsKey(abbreviation);
    }
    
    // Method to find the explanation for a given abbreviation
    public String findExplanationFor(String abbreviation) {
        return abbreviations.get(abbreviation);
    }
}
