public class MainProgram {

    public static void main(String[] args) {
        // create a new hand of cards
        Hand hand = new Hand();

        // add cards to the hand
        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(4, Suit.SPADE));
        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(7, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        // sort the cards in the hand by suit
        hand.sortBySuit();

        // print the sorted hand of cards
        hand.print();
    }
}
public class Card implements Comparable<Card> {
    
    public int number;
    public Suit suit;
    
    public Card(int number, Suit suit) {
        this.number = number;
        this.suit = suit;
    }
    
    @Override
    public String toString() {
        // converts the card number to a string value
        String value = String.valueOf(number);
        switch (number) {
            case 11:
                value = "J";
                break;
            case 12:
                value = "Q";
                break;
            case 13:
                value = "K";
                break;
            case 14:
                value = "A";
                break;
        }
        
        // returns the card suit and value as a string
        return this.suit + " " + value;
    }
    
    public int getValue() {
        // returns the card value
        return this.number;
    }
    
    public Suit getSuit() {
        // returns the card suit
        return this.suit;
    }

    @Override
    public int compareTo(Card card) {
        // compares two cards based on their value and suit
        if (this.number == card.number) {
            return this.suit.ordinal() - card.suit.ordinal();
        } else {
            return this.number - card.number;
        }
    }
}
public enum Suit {
    
    CLUB, DIAMOND, HEART, SPADE
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// This class represents a collection of playing cards.
public class Hand implements Comparable<Hand> {

    List<Card> list;

    // Constructor to create an empty hand.
    public Hand() {
        this.list = new ArrayList<>();
    }

    // Add a card to the hand.
    public void add(Card card) {
        list.add(card);
    }

    // Print the cards in the hand.
    public void print() {
        list.stream()
                .forEach(p -> System.out.println(p));
    }

    // Sort the cards in the hand by value.
    public void sort() {
        Collections.sort(list);
    }

    // Sort the cards in the hand by suit.
    public void sortBySuit() {
        list = list.stream()
                    .sorted(Comparator.comparing(Card::getSuit))
                    .collect(Collectors.toList());
    }

    // Compare this hand with another hand based on the sum of the card values.
    @Override
    public int compareTo(Hand otherHand) {
        int sumOfThisHand = list.stream()
                .mapToInt(Card::getValue)
                .sum();

        int sumOfOtherHand = otherHand.list.stream()
                .mapToInt(Card::getValue)
                .sum();

        return sumOfThisHand - sumOfOtherHand;
    }
}

// This class implements a comparator to sort cards by suit.
import java.util.Comparator;

public class SortBySuit implements Comparator<Card> {
    
    // Compare two cards based on their suit.
    public int compare(Card c1, Card c2) {
        return c1.getSuit().ordinal() - c2.getSuit().ordinal();
    }
}
