public class ArrayDemo {
  public static void main(String[] args) {
    //declares an array of integers
    int anArray[];
    
    //Allocates memory for 5 integers
    anArray = new int[5];
    
    //Initialize first element
    anArray[0] = 100;
    //Initialize second element
    anArray[1] = 200;
    //And so on...
    anArray[2] = 300;
    anArray[3] = 400;
    anArray[4] = 500;
    
    int i;
    
    //print out elements by for loop
    for(i = 0; i < anArray.length; i++) {
      System.out.println("Element at index " + i + ": " + anArray[i]);
    }
  }
}
