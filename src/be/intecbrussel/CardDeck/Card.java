package be.intecbrussel.CardDeck;

public class Card {
    SuitType suit;
    Value number;

    //Constructor
    public Card(SuitType suit, Value number) {
        this.suit = suit;
        this.number = number;
    }


    //Getters en setters
    public SuitType getSuit() {
        return suit;
    }

    public void setSuit(SuitType suit) {
        this.suit = suit;
    }

    public Value getNumber() {
        return number;
    }

    public void setNumber(Value number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return suit + " number :" + number  + "\n";
    }
}
