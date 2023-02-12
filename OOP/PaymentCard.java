public class MainProgram { // MainProgram class
  
    public static void main(String[] args) { // Main method
      
        // Create two PaymentCard objects, with an opening balance and name
        PaymentCard Paul = new PaymentCard(20, "Paul");
        PaymentCard Matt = new PaymentCard(30, "Matt");

        // Paul and Matt both use their cards to buy food, using the `eatHeartily` and `eatAffordably` methods
        Paul.eatHeartily();
        Matt.eatAffordably();

        // Print the details of Paul's and Matt's cards to the console
        System.out.println(Paul.toString());
        System.out.println(Matt.toString());

        // Paul adds money to his card, and Matt buys more food
        Paul.addMoney(20);
        Matt.eatHeartily();

        // Print the details of Paul's and Matt's cards
        System.out.println(Paul.toString());
        System.out.println(Matt.toString());

        // Paul buys more food, and Matt adds money to his card
        Paul.eatAffordably();
        Paul.eatAffordably();
        Matt.addMoney(50);

        // Print the details of Paul's and Matt's cards 
        System.out.println(Paul.toString());
        System.out.println(Matt.toString());
    } // End main method
} // End MainProgram class

class PaymentCard { // PaymentCard class
    private double balance;
    private String name;

    // Constructor for the PaymentCard class, which sets the opening balance and name of the card
    public PaymentCard(double openingBalance, String name) {
        this.balance = openingBalance;
        this.name = name;
    }

    // Override the `toString` method to return the name and balance of the card in a formatted string
    @Override
    public String toString() {
        return this.name + ": The card has a balance of " + this.balance + " euros";
    }

    // Method to reduce the balance of the card by 2.60
    public void eatAffordably() {
        balance -= 2.60;
    }

    // Method to reduce the balance of the card by 4.60
    public void eatHeartily() {
        balance -= 4.60;
    }

    // Method to increase the balance of the card by a specified amount
    public void addMoney(double amount) {
        balance += amount;
    }
} // End PaymentCard class
