// Creating a GradeBook object and calling its displayMessage method

public class CreatingObject {
    // main method begins program execution
    public static void main(String[] args) {
        // create a GradeBook object and assign it to myGradeBook
        CreatingObject myGradeBook = new JavaDeitelExercises();
        
        // call myGradeBook's displayMessage method
        myGradeBook.displayMessage();
    } // end main
    
    public void displayMessage() {
        System.out.println("Welcome to the Grade Book!");
    }
} // end class CreatingObject
