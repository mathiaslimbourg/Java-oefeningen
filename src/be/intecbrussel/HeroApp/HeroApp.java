package be.intecbrussel.HeroApp;



public class HeroApp {
    public static void main(String[] args) {
        AllTheHeroes allTheHeroes = new AllTheHeroes();
        Hero Braum = new ArmoredHero("Braum",42, "MOUSTASJE");
        Hero Garen = new ArmoredHero("Garen",69,"DEMARCIA");
        Hero Leona = new Tank("Leona", 24,"Schield en vriend");
        Hero Ezrael = new Energizer("Ezrael",8,"Shoots Q");
        Hero Kayle = new Shapeshifter("Kayle",23,"Blade and sandals");


        allTheHeroes.addSuperHero(Braum);
        allTheHeroes.addSuperHero(Garen);
        allTheHeroes.addSuperHero(Leona);
        allTheHeroes.addSuperHero(Ezrael);
        allTheHeroes.addSuperHero(Kayle);


        allTheHeroes.print();




    }


    private void printHeader(){

    }
    private void fanceLines(){

    }


}
