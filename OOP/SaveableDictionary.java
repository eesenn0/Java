public class Main {

    public static void main(String[] args) {
        // Create an instance of SaveableDictionary and specify the filename to use
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        
        // Load the contents of the dictionary from the file, and store whether it was successful
        boolean wasSuccessful = dictionary.load();

        // If loading was successful, print a message indicating so
        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        // Translate three different words using the dictionary and print the results
        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
    }
}
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {

    // Initialize an empty dictionary using a HashMap to store key-value pairs
    private Map<String, String> dictionary;
    
    // The filename to use for the dictionary file
    private String file;

    // Constructor to initialize an empty dictionary
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    // Constructor to initialize the dictionary and specify the filename to use
    public SaveableDictionary(String file) {
        this.file = file;
        this.dictionary = new HashMap<>();
    }

    // Load the contents of the dictionary from a file
    public boolean load() {
        // Create a new file object using the specified filename
        File f = new File(this.file);

        // If the file doesn't exist, create a new empty file
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        try {
            // Open the file for reading using a FileReader and a Scanner
            Scanner scanner = new Scanner(new FileReader(this.file));
            
            // Read each line of the file and split it into key-value pairs
            while (scanner.hasNextLine()) {
                String parts[] = scanner.nextLine().split(":");
                if (parts.length >= 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();
                    // Add each key-value pair to the dictionary
                    this.dictionary.put(key, value);
                }
            }
            scanner.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Add a new word translation to the dictionary
    public void add(String words, String translation) {
        // Store the translation for both the original word and the translated word
        this.dictionary.put(words, translation);
        this.dictionary.put(translation, words);
    }

    // Translate a word by looking it up in the dictionary
    public String translate(String word) {
        return this.dictionary.get(word);
    }

    // Delete a word and its translation from the dictionary
    public void delete(String word) {
        String translation = this.dictionary.get(word);
        this.dictionary.remove(word);
        this.dictionary.remove(translation);
    }

}
