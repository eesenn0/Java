// Define a class called MainPrograms
public class MainPrograms {

    // Define a method called main, which is the entry point for this program
    public static void main(String[] args) {
        
        // Create a new instance of a class called DictionaryOfManyTranslations
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        
        // Add translations to the dictionary for the word "lie"
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");
        
        // Add translations to the dictionary for the word "bow"
        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");
        
        // Print the translation for the word "lie" to the console
        System.out.println(dictionary.translate("lie"));
        
        // Remove all translations for the word "bow" from the dictionary
        dictionary.remove("bow");
        
        // Print the translation for the word "bow" to the console (which should be null, since we removed it)
        System.out.println(dictionary.translate("bow"));
    }
    
}
// Import the necessary classes from the Java standard library
import java.util.ArrayList;
import java.util.HashMap;

// Define a class called DictionaryOfManyTranslations
class DictionaryOfManyTranslations {
    
    // Define a private member variable called "translate", which is a HashMap that maps Strings to ArrayLists of Strings
    private HashMap<String, ArrayList<String>> translate;
    
    // Define a constructor method for the DictionaryOfManyTranslations class
    public DictionaryOfManyTranslations() {
        // Initialize the translate HashMap to a new instance of a HashMap
        this.translate = new HashMap<>();
    }
    
    // Define a method called "add" that takes in a word and a translation, and adds the translation to the list of translations for that word
    public void add(String word, String translation) {
        // If the translate HashMap does not already contain an entry for the given word, create a new ArrayList for it
        this.translate.putIfAbsent(word, new ArrayList<>());
        
        // Retrieve the ArrayList of translations for the given word from the translate HashMap
        ArrayList<String> translate = this.translate.get(word);
        
        // Add the new translation to the ArrayList of translations for the given word
        translate.add(translation);
    }
    
    // Define a method called "translate" that takes in a word and returns the list of translations for that word
    public ArrayList<String> translate(String word) {
        // If the translate HashMap contains an entry for the given word, return the ArrayList of translations for that word
        if (translate.containsKey(word)) {
            return translate.get(word);
        }
        
        // If the translate HashMap does not contain an entry
        return null;
    }
    // Define a method called "remove" that deletes the word
    public void remove(String word) {
        this.translate.remove(word);
    }
}
