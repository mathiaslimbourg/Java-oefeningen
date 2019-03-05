package be.intecbrussel.Animal;

public abstract class Animal {

    private String name;
    private int age;
    private String gender;
    private double weight;


    //Constructors
    public Animal() {}

    public Animal(String name, int age, String gender, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }


    //Getters & Setters


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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }
}
