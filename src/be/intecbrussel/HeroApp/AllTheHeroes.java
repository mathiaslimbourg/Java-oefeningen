package be.intecbrussel.HeroApp;

import java.util.Arrays;

public class AllTheHeroes {



    ArmoredHero[] armoredHeroes = new ArmoredHero[0];
    Energizer[] energizers = new Energizer[0];
    Tank[] tanks = new Tank[0];
    Shapeshifter[] shapeshifters = new Shapeshifter[0];

    public AllTheHeroes() {
    }

    public void addSuperHero(Hero hero){

        if (hero instanceof ArmoredHero){
            addArmoredHero((ArmoredHero)hero);
        }

        if (hero instanceof Tank){
            addTankHero((Tank)hero);
        }

        if (hero instanceof Energizer){
            addEnergizer((Energizer)hero);
        }
        if (hero instanceof Shapeshifter){
            addShapeshifter((Shapeshifter)hero);
        }

    }


    private void addArmoredHero(ArmoredHero hero){
        ArmoredHero[] temp = Arrays.copyOf(armoredHeroes, armoredHeroes.length+1);
        temp[armoredHeroes.length] = hero;
        armoredHeroes=temp;
    }
    private void addTankHero(Tank hero){
        Tank[] temp = Arrays.copyOf(tanks, tanks.length+1);
        temp[tanks.length] = hero;
        tanks=temp;
    }
    private void addEnergizer(Energizer hero){
        Energizer[] temp = Arrays.copyOf(energizers, energizers.length+1);
        temp[energizers.length] = hero;
        energizers=temp;
    }
    private void addShapeshifter(Shapeshifter hero){
        Shapeshifter[] temp = Arrays.copyOf(shapeshifters, shapeshifters.length+1);
        temp[shapeshifters.length] = hero;
        shapeshifters=temp;
    }


    public void removeSuperHero(){
        //todo
        for (int i = 0; i<armoredHeroes.length;i++){

        }
    }

    private boolean isHeroTypePresent(){
        //todo
        return false;
    }

    public void print(){
        if (armoredHeroes.length>0){
            System.out.println("Er zijn "  + armoredHeroes.length + " Armored Heroes");
            for (int x = 0; x<armoredHeroes.length;x++){
                System.out.println(" " + armoredHeroes[x].toString());
            }
        }else {
            System.out.println("Er zijn geen armored Heroes");
        }
        if (tanks.length>0){
            System.out.println("Er zijn "  + tanks.length + " Tanks Heroes");
            for (int x = 0; x<tanks.length;x++){
                System.out.println(" " + tanks[x].toString());
            }
        }else {
            System.out.println("Er zijn geen tank Heroes");
        }
        if (energizers.length>0){
            System.out.println("Er zijn "  + energizers.length + " Tanks Heroes");
            for (int x = 0; x<energizers.length;x++){
                System.out.println(" " + energizers[x].toString());
            }
        }else {
            System.out.println("Er zijn geen tank Heroes");
        }
        if (shapeshifters.length>0){
            System.out.println("Er zijn "  + shapeshifters.length + " shapeshifters Heroes");
            for (int x = 0; x<shapeshifters.length;x++){
                System.out.println(" " + shapeshifters[x].toString());
            }
        }else {
            System.out.println("Er zijn geen shapeshifters Heroes");
        }

    }


}
