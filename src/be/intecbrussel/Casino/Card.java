package be.intecbrussel.Casino;


public class Card {
    private SuitType suit;
    private Value value;

    //Constr
    public Card(SuitType suit, Value value) {
        this.suit = suit;
        this.value = value;
    }


    public String toString() {
        return this.suit.toString() + " " + this.value.toString();
    }

    public SuitType getSuit() {
        return suit;
    }

    public void setSuit(SuitType suit) {
        this.suit = suit;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
