import java.util.Scanner; // to use scanner

public class SumOfArray { // SumOfArray class

    public static void main(String[] args) { // main method

        Scanner scanner = new Scanner(System.in);
        int numbers[] = new int[5];
        int i;
        for (i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(sumOfNumbersInArray(numbers));

    } // end main method

    public static int sumOfNumbersInArray(int array[]) { // method
        int sum = 0; // initialize sum
        int i;
        for (i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum; // return
    } // end sumOfNumbersInArray
}  // end SumOfArray class
