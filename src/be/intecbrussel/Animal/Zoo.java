package be.intecbrussel.Animal;

import java.util.Arrays;

public class Zoo {
    Lion[] lion = new Lion[0];
    Fish[] fish = new Fish[0];
    Bird[] bird = new Bird[0];
    Cat[] cat = new Cat[0];
    Snake[] snake = new Snake[0];


    public void addAnimal(Animal animal){
        if (animal instanceof Lion){
            addLion((Lion)animal);
        }
        if (animal instanceof Fish){
            addFish((Fish) animal);
        }
        if (animal instanceof Bird){
            addBird((Bird) animal);
        }
        if (animal instanceof Cat){
            addCat((Cat) animal);
        }
        if (animal instanceof Snake){
            addSnake((Snake) animal);
        }
    }

    private void addLion(Lion animal){
        Lion[] temp = Arrays.copyOf(lion,lion.length+1);

        temp[lion.length]=animal;
        lion=temp;
    }

    private void addFish(Fish animal){
        Fish[] temp = Arrays.copyOf(fish, fish.length+1);

        temp[fish.length]=animal;
        fish=temp;
    }

    private void addBird(Bird animal){
        Bird[] temp = Arrays.copyOf(bird, bird.length+1);

        temp[bird.length]=animal;
        bird=temp;
    }

    private void addCat(Cat animal){
        Cat[] temp = Arrays.copyOf(cat, cat.length+1);

        temp[cat.length]=animal;
        cat=temp;
    }

    private void addSnake(Snake animal){
        Snake[] temp = Arrays.copyOf(snake, snake.length+1);

        temp[snake.length]=animal;
        snake=temp;
    }

    public void printAnimals(){
        //printLion
        if (lion.length>0) {
            System.out.println("Wij hebben " + lion.length + " leeuwen in onze zoo");
            for (int x = 0; x < lion.length; x++) {
                System.out.println(" " + lion[x].toString());
            }
        }else{
            System.out.println("Er zijn geen leeuwen in deze zoo");
        }
        //printFish
        if (fish.length>0) {
            System.out.println("Wij hebben " + fish.length + " vissen in onze zoo");
            for (int x = 0; x < fish.length; x++) {
                System.out.println(" " + fish[x].toString());
            }
        }else{
            System.out.println("Er zijn geen vissen in deze zoo");
        }
        //printBird
        if (bird.length>0) {
            System.out.println("Wij hebben " + bird.length + " vogels in onze zoo");
            for (int x = 0; x < bird.length; x++) {
                System.out.println(" " + bird[x].toString());
            }
        }else{
            System.out.println("Er zijn geen vogels in deze zoo");
        }
        //printCat
        if (cat.length>0) {
            System.out.println("Wij hebben " + cat.length + " katten in onze zoo");
            for (int x = 0; x < cat.length; x++) {
                System.out.println(" " + cat[x].toString());
            }
        }else{
            System.out.println("Er zijn geen katten in deze zoo");
        }
        //printSnake
        if (snake.length>0) {
            System.out.println("Wij hebben " + snake.length + " slangen in onze zoo");
            for (int x = 0; x < snake.length; x++) {
                System.out.println(" " + snake[x].toString());
            }
        }else{
            System.out.println("Er zijn geen slangen in deze zoo");
        }

    }


}
