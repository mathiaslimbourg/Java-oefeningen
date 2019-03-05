package be.intecbrussel.Casino;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("Welkom to blackjack");

        //create playing deck
        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();
        playingDeck.shuffle();



        System.out.println(playingDeck);


    }
}
