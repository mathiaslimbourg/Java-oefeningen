package be.intecbrussel.HeroApp;

public class Tank extends Hero {

    public Tank() {
    }
    public Tank(String alias) {
        super(alias);
    }
    public Tank(String alias, int age, String power) {
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
