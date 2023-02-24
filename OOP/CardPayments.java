// This is the class MainProgram, which contains the main method to run the program.
public class MainProgram {

    public static void main(String[] args) {
        
        // Create a new PaymentTerminal object called "unicafeExactum".
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        
        // Print out the details of the PaymentTerminal object.
        System.out.println(unicafeExactum);

        // Create a new PaymentCard object called "annesCard" with an initial balance of 2 euros.
        PaymentCard annesCard = new PaymentCard(2);

        // Print out the amount of money on the card.
        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        // Try to buy a hearty meal from the PaymentTerminal using the PaymentCard. 
        // Print out whether or not the purchase was successful.
        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        // Add 100 euros to the PaymentCard using the PaymentTerminal.
        unicafeExactum.addMoneyToCard(annesCard, 100);

        // Try to buy another hearty meal from the PaymentTerminal using the PaymentCard. 
        // Print out whether or not the purchase was successful.
        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        // Print out the new amount of money on the card.
        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        // Print out the updated details of the PaymentTerminal object.
        System.out.println(unicafeExactum);
    }
}
// This is the PaymentTerminal class, which represents a payment terminal that can sell affordable and hearty meals.

class PaymentTerminal {

    // The amount of cash in the payment terminal.
    private double money;

    // The number of sold affordable meals.
    private int affordableMeals;

    // The number of sold hearty meals.
    private int heartyMeals;

    // The constructor for the PaymentTerminal class, which sets the initial amount of cash to 1000.
    public PaymentTerminal() {
        this.money = 1000;
    }

    // This method allows the sale of an affordable meal for a given payment.
    public double eatAffordably(double payment) {
        double change;

        // If the payment is enough to cover the cost of the meal, calculate the change, add the money to the terminal, and increment the number of affordable meals sold.
        if (payment >= 2.50) {
            change = payment - 2.50;
            this.money += 2.50;
            affordableMeals++;

            return change;
        } else {
            // Otherwise, return the payment without selling the meal.
            return payment;
        }
    }

    // This method allows the sale of a hearty meal for a given payment.
    public double earHeartily(double payment) {
        double change;

        // If the payment is enough to cover the cost of the meal, calculate the change, add the money to the terminal, and increment the number of hearty meals sold.
        if (payment >= 4.30) {
            change = payment - 4.30;
            this.money += 4.30;
            heartyMeals++;

            return change;
        } else {
            // Otherwise, return the payment without selling the meal.
            return payment;
        }
    }

    // This method allows the sale of an affordable meal to a PaymentCard holder.
    public boolean eatAffordably(PaymentCard card) {
        // If the card has enough money to cover the cost of the meal, subtract the money from the card and increment the number of affordable meals sold.
        if (card.balance() >= 2.50) {
            card.takeMoney(2.50);
            affordableMeals++;

            return true;
        } else {
            // Otherwise, return false to indicate that the sale was unsuccessful.
            return false;
        }
    }

    // This method allows the sale of a hearty meal to a PaymentCard holder.
    public boolean eatHeartily(PaymentCard card) {
        // If the card has enough money to cover the cost of the meal, subtract the money from the card and increment the number of hearty meals sold.
        if (card.balance() >= 4.30) {
            card.takeMoney(4.30);
            heartyMeals++;

            return true;
        } else {
            // Otherwise, return false to indicate that the sale was unsuccessful.
            return false;
        }
    }

    // This method allows money to be added to a PaymentCard using the payment terminal.
    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
        this.money += sum;
    }

    // This method returns a string representation of the payment terminal object, including the amount of cash and the number of affordable and hearty meals sold.
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}
// This is a class definition for a PaymentCard

class PaymentCard {

    // This private variable will store the balance on the card
    private double balance;

    // This is the constructor method for the PaymentCard class.
    // It initializes the balance of the card to the value passed in as an argument
    public PaymentCard(double balance) {
        this.balance = balance;
    }

    // This method returns the current balance on the card
    public double balance() {
        return this.balance;
    }

    // This method increases the balance on the card by the amount passed in as an argument
    public void addMoney(double increase) {
        this.balance += increase;
    }

    // This method tries to take money from the card. If there is enough money on the card,
    // it deducts the amount from the balance and returns true. Otherwise, it returns false.
    public boolean takeMoney(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }

        return false;
    }
}
