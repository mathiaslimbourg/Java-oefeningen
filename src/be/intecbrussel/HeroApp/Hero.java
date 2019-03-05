package be.intecbrussel.HeroApp;

public abstract class Hero {
    private String alias;
    private int age;
    private String power;

    public abstract void useSuperPower();


    public Hero() {
    }
    public Hero(String alias) {
        this.alias = alias;
    }
    public Hero(String alias, int age, String power) {
        this.alias = alias;
        this.age = age;
        this.power = power;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }




}
