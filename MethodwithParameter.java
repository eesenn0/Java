// class declaration with one method that has a parameter

/* create GradeBook object and pass a String to
    its displayMessage method */

import java.util.Scanner; // program uses scanner

public class MethodwithParameter {
  
  // main method begins program execution
    public static void main(String[] args) {
      
      // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
      
      // create a GradeBook object and assign it to myGradeBook
        GradeBook myGradeBook = new GradeBook();

      // prompt for and input course name
        System.out.println("Please enter the course name:");
        String courseName = input.nextLine(); // read a line of text
        System.out.println(); // outputs a black line 
        
      /*  call myGradeBook's displayMessage method
          and pass nameOfCourse as an argument */
        myGradeBook.displayMessage(courseName);
    } // end main
} // end class MethodwithParameter

class GradeBook {
  
  // display a welcome message to the GradeBook user
    public void displayMessage(String courseName) {
        System.out.println("Welcome to the grade book for " + courseName);
    } // end method displayMessage
} // end class GradeBook
