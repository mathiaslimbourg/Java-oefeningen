package be.intecbrussel.Animal_OefeningJamie;

public class Animal {
    private String naam;


    public Animal(String naam) {
        this.naam = naam;

    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString(){
        return "Naam: " + naam ;
    }
}
