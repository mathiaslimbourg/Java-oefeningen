package be.intecbrussel.HeroApp;

public class ArmoredHero extends Hero {

    public ArmoredHero() {
    }
    public ArmoredHero(String alias) {
        super(alias);
    }
    public ArmoredHero(String alias, int age, String power) {
        super(alias, age, power);
    }

    @Override
    public void useSuperPower(){
        System.out.println("SCHIELDS");
    }

    @Override
    public String toString() {
        return "Naam: " + getAlias() + " | " + getAge() + " | " + getPower();
    }
}
