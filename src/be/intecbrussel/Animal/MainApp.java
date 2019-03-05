package be.intecbrussel.Animal;

public class MainApp {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        //AANMAKEN VAN OBJECTEN
        Animal leeuwMama = new Lion();
        Animal leeuwPapa = new Lion();

        Animal visMama = new Fish();
        Animal visPapa = new Fish();


        //AANMAKEN VAN 2 LEEUWEN
        leeuwMama.setName("Nidalee");
        leeuwMama.setAge(8);
        leeuwMama.setGender("Female");
        leeuwMama.setWeight(130);
        zoo.addAnimal(leeuwMama);

        leeuwPapa.setName("Udyr");
        leeuwPapa.setAge(10);
        leeuwPapa.setGender("Male");
        leeuwPapa.setWeight(190);
        zoo.addAnimal(leeuwPapa);


        //AANMAKEN VAN 2 VISSEN
        visMama.setName("Nami");
        visMama.setAge(15);
        visMama.setGender("Female");
        visMama.setWeight(2);
        zoo.addAnimal(visMama);

        visPapa.setName("Fizz");
        visPapa.setAge(32);
        visPapa.setGender("Male");
        visPapa.setWeight(4);
        zoo.addAnimal(visPapa);


        //PRINTEN VAN DE DIEREN
        zoo.printAnimals();






    }
}
