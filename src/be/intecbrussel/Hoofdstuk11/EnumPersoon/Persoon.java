package be.intecbrussel.Hoofdstuk11.EnumPersoon;


public class Persoon {
    private String name;
    private int age;
    private double weight;
    Gender gender;

    public Persoon(){}

    public Persoon(String name, int age, double weight, Gender gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "name=' " + name + '\'' +
                ", age= " + age +
                ", weight= " + weight +
                ", gender= " + gender +
                '}';
    }
}
