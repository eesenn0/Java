// the main class that contains the main method
public class FirstAccount {

    public static void main(String[] args) { // main method
      
        // create two Account objects with name and balance
        Account artosAccount = new Account("Arto's Account", 100.00);
        Account artosSwissAccount = new Account("Arto's Switzerland Account", 1000000.00);

        System.out.println("Initial state");
        // print the initial state of the two Account objects
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);

        // withdraw 20 from Arto's account
        artosAccount.withdraw(20);
        // print the updated balance of Arto's account
        System.out.println("The balance of Arto's account is now: " + artosAccount.balance());
        // deposit 200 to Arto's Switzerland account
        artosSwissAccount.deposit(200);
        // print the updated balance of Arto's Switzerland account
        System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance());

        System.out.println("End state.");
        // print the final state of the two Account objects
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);
    } // end main method
} // end FirstAccount class

// the Account class that represents a bank account
class Account {

    // private instance variables to store the name and balance of the account
    private String name;
    private double balance;

    // constructor to initialize the name and balance of the account
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // method to return the balance of the account
    public double balance() {
        return this.balance;
    }

    // method to deposit a specified amount to the account
    public void deposit(double amount) {
        this.balance += amount;
    }

    // method to withdraw a specified amount from the account
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    // overridden toString method to return the name and balance of the account as a string
    @Override
    public String toString() {
        return this.name + ": " + this.balance;
    }
}
