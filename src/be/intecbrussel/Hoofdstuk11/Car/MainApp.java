package be.intecbrussel.Hoofdstuk11.Car;

public class MainApp {
    public static void main(String[] args) {
        Car auto = new Car(120,360,12.00,50,BrandType.AUDI,Person.MATHIAS,FeulType.GAS);
        Car voit = new Car(120,360,12.00,50,BrandType.AUDI,Person.MATHIAS,FeulType.GAS);
        System.out.println(auto.toString());
        System.out.println(voit.toString());
    }
}
