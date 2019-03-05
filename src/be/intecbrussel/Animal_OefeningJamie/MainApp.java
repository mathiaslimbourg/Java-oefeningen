package be.intecbrussel.Animal_OefeningJamie;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Random rand = new Random();

        for (int i = 0; i<2; i++){
            Animal anim = null;
            int caseRand = rand.nextInt(2);
            switch (caseRand){
                case 0: anim = new Hond("Pita");break;
                case 1: anim = new Kat("Bary");break;
            }
            zoo.addAnimal(anim);
        }
        System.out.println(zoo.toString());
    }
}
