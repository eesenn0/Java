import java.util.Scanner; // to use scanner

public class GiftTax { // GiftTax class

    public static void main(String[] args) { // main method
        // create scanner to take an input
        Scanner scanner = new Scanner(System.in);

        // taking input
        System.out.println("Value of the gift?");
        int amount = Integer.valueOf(scanner.nextLine());

        // conditional statements
        if (amount < 5000) {
            // no tax for under €5000 gift
            System.out.println("No tax!");
        } else if (amount < 25000) {
            // tax formula for between €5000-€25000 gift 
            double tax_1 = (100 + (amount - 5000) * 0.08);
            System.out.println("Tax: " + tax_1);
        } else if (amount < 55000) {
            // tax formula for between €25000-€55000 gift
            double tax_2 = (1700 + (amount - 25000) * 0.1);
            System.out.println("Tax: " + tax_2);
        } else if (amount < 200000) {
            // tax formula for between €55000-€200000 gift
            double tax_3 = (4700 + (amount - 55000) * 0.12);
            System.out.println("Tax: " + tax_3);
        } else if (amount < 1000000) {
            // tax formula for between €200000-€1000000 gift
            double tax_4 = (22100 + (amount - 200000) * 0.15);
            System.out.println("Tax: " + tax_4);
        } else {
            // tax formula for above €1000000 gift
            double tax_5 = (142100 + (amount - 1000000) * 0.17);
            System.out.println("Tax: " + tax_5);
        }

    } // end of main method
} // end of GiftTax class
