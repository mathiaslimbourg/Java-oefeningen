package be.intecbrussel.CardDeck;


import java.util.Arrays;

public class Deck {
    Card [] cards = new Card[52];


    {
        makeDeck();
    }

    public Deck(Card[] cards) {
        super();
        makeDeck();
    }

    public Deck() {

    }

    private void makeDeck(){
        SuitType[] suits = SuitType.values();
        Value[] values = Value.values();
        int CardCount = 0;
        for (SuitType suit : suits){
            for (Value value : values){
                cards[CardCount++] = new Card(suit, value);
            }
        }
    }

    public void printDeck(){
        System.out.println(Arrays.toString(cards));
    }
}
