package be.intecbrussel.Hoofdstuk11.Library;

public class MainApp {
    public static void main(String[] args) {
        Library Boekenbeurs = new Library("Boekenbeurs Halle");
        Writer mathias = new Writer("Mathias");
        Book HarryPotter = new Book("Harry Potter",362,BookCategory.SCIENCEFICTION);

        System.out.println(Boekenbeurs);
        System.out.println(mathias);
        System.out.println(HarryPotter.toString());
    }
}
