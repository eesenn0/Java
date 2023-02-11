public class Main { // Main class

    public static void main(String[] args) { // Main method
        // Create a new instance  with an initial balance of $120,000 and an interest rate of 1.01
        Debt mortgage = new Debt(120000.0, 1.01);
        
        // Print the balance of the debt
        mortgage.printBalance();

        // Wait one year, which updates the balance based on the interest rate
        mortgage.waitOneYear();
        mortgage.printBalance();

        // Loop through the next 20 years, updating the balance each year
        int years = 0;
        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        // Print the final balance after 20 years
        mortgage.printBalance();
    } // End main method
} // End Main class

class Debt { // Debt class
    // Balance of the debt
    double balance;
    // Interest rate of the debt
    double interestRate;

    // Constructor for the Debt class
    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    // Method to print the balance of the debt
    public void printBalance() {
        System.out.println(balance);
    }

    // Method to wait one year and update the balance based on the interest rate
    public void waitOneYear() {
        balance = (balance * this.interestRate);
    }
} // End Debt class

