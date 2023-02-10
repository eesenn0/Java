public class FirstBankTransfer { // FirstBankTransfer class

    public static void main(String[] args) { // main method

        // Creating two account objects, one for Matthews and one for the user
        Account matthewsAccount = new Account("Matthews's Account", 1000.00);
        Account myAccount = new Account("My Account", 0);

        // Printing the initial state of both accounts
        System.out.println("Initial state");
        System.out.println(matthewsAccount);
        System.out.println(myAccount);

        // Withdrawing 100 from Matthews's account and depositing 100 to the user's account
        matthewsAccount.withdraw(100);
        myAccount.deposit(100);

        // Printing the final state of both accounts
        System.out.println("End state.");
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    } // end main method
} // end FirstBankTransfer class

class Account { // Account class

    // Instance variables for the account name and balance
    private final String name;
    private double balance;

    // Constructor for initializing the name and balance of an account
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Method to return the balance of an account
    public double balance() {
        return this.balance;
    }

    // Method to deposit an amount to an account
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Method to withdraw an amount from an account
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    // Overriding the toString method to return the name and balance of an account in a string format
    @Override
    public String toString() {
        return this.name + ": " + this.balance;
    }
}
