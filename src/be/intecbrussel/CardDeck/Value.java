package be.intecbrussel.CardDeck;

public enum Value {
    ACE("Ace",1),
    TWO("Two",2),
    THREE("Three",3),
    FOUR("Four",4),
    FIVE("Five",5),
    SIX("Six",6),
    SEVEN("Seven",7),
    EIGHT("Eight",8),
    NINE("Nine",9),
    TEN("Ten",10),
    JACK("Jack",11),
    QUEEN("Queen",12),
    KING("King",13);

    private int value;
    private String name;

    //Constructor
    Value( String name,int value) {
        this.value = value;
        this.name = name;
    }


    //Getters en setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
