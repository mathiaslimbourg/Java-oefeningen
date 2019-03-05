package be.intecbrussel.HeroApp;

public class Energizer extends Hero {

    public Energizer() {
    }
    public Energizer(String alias) {
        super(alias);
    }
    public Energizer(String alias, int age, String power) {
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
