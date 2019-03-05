package be.intecbrussel.Hoofdstuk11.BoekVoorbeelden;

import static be.intecbrussel.Hoofdstuk11.BoekVoorbeelden.Color.*;

public class ColorApp {
    public static void main(String[] args) {
        Color color1 = RED;


        printColor(color1);


        /*for (Color c : Color.values()){
            System.out.println(c);
        }*/

    }

    public static void printColor(Color color){
        System.out.println("Naam: " + color.name());
        System.out.println("Positie: " + color.ordinal());
        System.out.println(color.getRgb());
        System.out.println(color);
        String text = null;
        switch (color){
            case BLACK: text = "BLACK";break;
            case WHITE: text = "WHITE";break;
            case RED: text = "RED";break;
            case GREEN: text = "GREEN";break;
            case BLUE: text = "BLUE";break;
            case YELLOW: text = "YELLOW";break;

        }

    }
}
