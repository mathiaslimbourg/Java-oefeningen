package be.intecbrussel.Casino;


import java.util.ArrayList;
import java.util.Random;

public class Deck {

    //Instance var
    private ArrayList<Card> cards;

    //Constr
    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public void createFullDeck(){
        //Generate cards
        for ( SuitType cardSuit : SuitType.values()){
            for (Value cardValue : Value.values()){
                //Add a new card to the deck
                this.cards.add(new Card(cardSuit,cardValue));
            }
        }
    }

    public void shuffle(){
        ArrayList<Card> tmpDeck = new ArrayList<Card>();
        //Random
        Random random = new Random();
        int randomCardIndex = 0;
        int originalSize = this.cards.size();
        for (int i = 0; i<originalSize;i++){
            //Generate random index
            randomCardIndex = random.nextInt((this.cards.size()-1 -0)+1) +0;
            tmpDeck.add(this.cards.get(randomCardIndex));
            //Remove from original deck
            this.cards.remove(randomCardIndex);
        }

        this.cards = tmpDeck;

    }




    //Getters & setters
    public void removeCard(int i){
        this.cards.remove(i);
    }

    public Card getCard(int i){
        return this.cards.get(i);
    }

    public void addCard(Card addCard){
        this.cards.add(addCard);
    }

    //toString
    public String toString(){
        String cardListOutput = " ";
        int i = 1;

        for (Card aCard : this.cards){
            cardListOutput += "\n" + i + " " + aCard.toString();
            i++;
        }
        return cardListOutput;
    }
}
