import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // create a scanner to read user input from the console
        Scanner scanner = new Scanner(System.in);
        // create a new instance of SimpleDictionary class
        SimpleDictionary dictionary = new SimpleDictionary();

        // create a new instance of TextUI class with the scanner and dictionary objects
        TextUI textUI = new TextUI(scanner, dictionary);
        // start the user interface
        textUI.start();
    }
}

import java.util.ArrayList;

class SimpleDictionary {
    // create two array lists to store words and their translations
    private ArrayList<String> words;
    private ArrayList<String> translations;

    public SimpleDictionary() {
        // initialize the two array lists
        this.words = new ArrayList<>();
        this.translations = new ArrayList<>();
    }

    public void add(String word, String translation) {
        // add the word and its translation to their respective array lists
        this.words.add(word);
        this.translations.add(translation);
    }

    public boolean contains(String word) {
        // check if the word exists in either the words or translations array list
        if (words.contains(word) || translations.contains(word)) {
            return true;
        }
        return false;
    }

    public String translate(String word) {
        // find the index of the word in the words array list
        int index = this.words.indexOf(word);

        if (index != -1) {
            // if the word is found, return its translation from the translations array list
            return this.translations.get(index);
        }

        // if the word is not found, return null
        return null;
    }
}

class TextUI {
    // create variables to store the scanner and simpleDictionary objects
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        // set the scanner and simpleDictionary objects
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            // print a command prompt for the user
            System.out.print("Command: ");
            // read the user's input
            String command = scanner.nextLine();

            if (command.equals("add")) {
                // if the user enters "add", prompt them for the word and its translation
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();

                // add the word and its translation to the dictionary
                simpleDictionary.add(word, translation);
            } else if (command.equals("search")) {
                // if the user enters "search", prompt them for the word to search
                System.out.print("To be translated: ");
                String word = scanner.nextLine();
                // search for the word in the dictionary and get its translation
                String translation = simpleDictionary.translate(word);
                if (translation != null) {
                    // if the word is found, print its translation
                    System.out.println("Translation: " + translation);
                } else {
                    // if the word is not found, print an error message
                    System.out.println("Word " + word + " was not found");
                }
            } else if (command.equals("end")) {
                // if the user enters "end", print a goodbye message and exit the loop
                System.out.println("Bye bye!");
                break;
            } else {
                // if the user enters an unknown command, print an error message
                System.out.println("Unknown command");
            }
        }
    }
}
