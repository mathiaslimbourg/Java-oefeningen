package be.intecbrussel.CardDeck;

public enum SuitType {
    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    SPADES("Spades"),
    HEARTS("Hearts");

    private String name;

    //Constructors
    SuitType(String name) {
        this.name = name;
    }

    //Getters en setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
