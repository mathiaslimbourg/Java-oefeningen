package be.intecbrussel.Animal_OefeningJamie;

import java.util.Arrays;

public class Zoo {
    private Hond[] honden;
    private Kat[] katten;

    public Zoo(){
        this.honden = new Hond[]{};
        this.katten = new Kat[]{};
    }

    public void addAnimal(Animal animal){

        if (animal instanceof Hond){
            addHond((Hond)animal);
        } else if (animal instanceof Kat){
            addKat((Kat)animal);
        }

    }

    public void addHond(Hond hond){
        Hond [] temp = new Hond[honden.length+1];
        for (int i = 0; i< honden.length; i++){
            temp[i] = honden[i];
        }
        temp[honden.length] = hond;
        honden = temp;
    }
    public void addKat(Kat kat){
        Kat [] temp = new Kat[katten.length+1];
        for (int i = 0; i< katten.length; i++){
            temp[i] = katten[i];
        }
        temp[katten.length] = kat;
        katten = temp;
    }

    @Override
    public String toString(){
        return "My zoo:\n Honden: " + Arrays.toString(honden) + "\n Katten: " + Arrays.toString(katten);
    }
}
