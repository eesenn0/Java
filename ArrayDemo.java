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
    
    //print out elements
    System.out.println("Element at index 0: " + anArray[0]);
    System.out.println("Element at index 1: " + anArray[1]);
    System.out.println("Element at index 2: " + anArray[2]);
    System.out.println("Element at index 3: " + anArray[3]);
    System.out.println("Element at index 4: " + anArray[4]);
  }
}
