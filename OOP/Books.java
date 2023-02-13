import java.util.Scanner; // To use Scanner
import java.util.ArrayList; // To use ArrayList

public class MainProgram { // MainProgram class

    public static void main(String[] args) { // Main method
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        // Create an ArrayList of books
        ArrayList<Book> bookList = new ArrayList<>();

        // Repeat the following until the user enters a blank title
        while (true) {
            System.out.println("Title: ");
            String name = scanner.nextLine();

            // If the title is blank, break out of the loop
            if (name.isBlank()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.println("Publication year: ");
            String pubYear = scanner.nextLine();

            // Create a new book using the given title, pages, and publication year
            Book new_book = new Book(name, pages, pubYear);

            // Add the new book to the book list
            bookList.add(new_book);
        }

        System.out.println("What information will be printed?");
        String info = scanner.nextLine();

        int i = 0;
        // Loop through the book list
        while (i < bookList.size()) {

            // Check what information the user wants to be printed
            switch (info) {
                // If the user wants everything, print the title, pages, and publication year
                case "everything":
                case "Everything":
                    System.out.println(bookList.get(i).getName() + ", "
                            + bookList.get(i).getPages() + " pages, " + bookList.get(i).getpubYear());
                    break;

                // If the user wants the title, print the title
                case "name":
                case "Name":
                    System.out.println(bookList.get(i).getName());
                    break;

                // If the user wants the number of pages, print the number of pages
                case "pages":
                case "Pages":
                    System.out.println(bookList.get(i).getPages());
                    break;

                // If the user wants the publication year, print the publication year
                case "Publication Year":
                case "publication year":
                    System.out.println(bookList.get(i).getpubYear());
                    break;

                // If the user enters an invalid command, print an error message
                default:
                    System.out.println("Invalid command!");
                    break;
            }
            i++; // Increment one until i = book number
        } // End switch statement
    } // End main method
} // End MainProgram class

class Book { // Book class
    // declare some variables
    String name;
    int pages;
    String pubYear;

    // Constructor for creating a book
    public Book(String initialName, int initialPages, String initialpubYear) {
        this.name = initialName;
        this.pages = initialPages;
        this.pubYear = initialpubYear;
    }

    // Getter method for the title of the book
    public String getName() {
        return name;
    }
  
    // Getter method for the pages of the book
    public int getPages() {
        return pages;
    }
  
    // Getter method for the publication year of the book
    public String getpubYear() {
        return pubYear;
    }
} // End Book class
