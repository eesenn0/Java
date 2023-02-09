import java.util.Scanner; // to use scanner

public class PrintInStars { // PrintInStars class

    public static void main(String[] args) { // main method

        Scanner scanner = new Scanner(System.in);
        int numbers[] = new int[5];
        int i;
        for (i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        printArrayInStars(numbers);

    } // end main method

    public static void printArrayInStars(int array[]) { // method
        int i;
        int star_no;
        for (i = 0; i < array.length; i++) {
            star_no = array[i];
            for (int j = 0; j < star_no; j++) {
                System.out.println("*"); // print stars
            } // end of smaller loop
            System.out.println(""); // next line
        } // end of bigger for loop
    } // end of printArrayInStars loop

}  // end PrintInStars class
