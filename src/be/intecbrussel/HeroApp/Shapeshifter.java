package be.intecbrussel.HeroApp;

public class Shapeshifter extends Hero {

    public Shapeshifter() {
    }
    public Shapeshifter(String alias) {
        super(alias);
    }
    public Shapeshifter(String alias, int age, String power) {
        super(alias, age, power);
    }

    @Override
    public void useSuperPower(){
        //todo
    }

    @Override
    public String toString() {
        return "Naam: " + getAlias() + " | " + getAge() + " | " + getPower();
    }
}
