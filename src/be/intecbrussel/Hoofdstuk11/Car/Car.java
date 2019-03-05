package be.intecbrussel.Hoofdstuk11.Car;

public class Car {
    private int horsePower;
    private int maxSpeed;
    private double feulUsage;
    private double maxFeul;
    BrandType brand;
    Person owner;
    FeulType feul;

    public Car(int horsePower, int maxSpeed, double feulUsage, double maxFeul, BrandType brand, Person owner, FeulType feul) {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.feulUsage = feulUsage;
        this.maxFeul = maxFeul;
        this.brand = brand;
        this.owner = owner;
        this.feul = feul;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFeulUsage() {
        return feulUsage;
    }

    public void setFeulUsage(double feulUsage) {
        this.feulUsage = feulUsage;
    }

    public double getMaxFeul() {
        return maxFeul;
    }

    public void setMaxFeul(double maxFeul) {
        this.maxFeul = maxFeul;
    }

    public BrandType getBrand() {
        return brand;
    }

    public void setBrand(BrandType brand) {
        this.brand = brand;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public FeulType getFeul() {
        return feul;
    }

    public void setFeul(FeulType feul) {
        this.feul = feul;
    }

    @Override
    public String toString() {
        return "Car = " + brand +"\n" +
                "horsePower = " + horsePower + "\n" +
                "maxSpeed = " + maxSpeed +"\n" +
                "feulUsage = " + feulUsage +"\n" +
                "maxFeul = " + maxFeul +"\n" +
                "owner = " + owner +"\n" +
                "feul = " + feul;
    }
}
