public class MainProgram {

    public static void main(String[] args) {
        // create two Money objects
        Money a = new Money(10, 0);
        Money b = new Money(3, 50);

        // subtract b from a and store the result in a new Money object c
        Money c = a.minus(b);

        // print out the values of a, b, and c
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // subtract a from c and update the value of c
        c = c.minus(a);

        // print out the values of a, b, and c again
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}

class Money {
    // instance variables for euros and cents
    private final int euros;
    private final int cents;

    // constructor method for creating Money objects
    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    // getter method for euros
    public int euros() {
        return euros;
    }

    // getter method for cents
    public int cents() {
        return cents;
    }

    // method for adding two Money objects together
    public Money plus(Money addition) {
        int newEuros = euros + addition.euros;
        int newCents = cents + addition.cents;

        // if the sum of the cents is greater than or equal to 100
        // adjust euros and cents accordingly
        if (newCents >= 100) {
            newEuros += newCents / 100;
            newCents %= 100;
        }

        // create a new Money object with the adjusted euros and cents and return it
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }

    // method for comparing two Money objects to see if one is less than the other
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

    // method for subtracting one Money object from another
    public Money minus(Money decreaser) {
        int newEuros = euros - decreaser.euros;
        int newCents = cents - decreaser.cents;

        // if the result is negative or zero, adjust euros and cents accordingly
        if (newCents <= 0) {
            newCents += 100;
            newEuros -= 1;
        }

        if (newEuros <= 0) {
            newEuros = 0;
            newCents = 0;
        }

        // create a new Money object with the adjusted euros and cents and return it
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }

    // method for displaying the value of a Money object as a string
    @Override
    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}
