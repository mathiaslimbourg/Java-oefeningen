package be.intecbrussel.test_basis;

import java.util.Scanner;

public class DagenUrenEnMinuten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geef aantal minuten in");
        int ingegevenNummer = input.nextInt();

        int dagen = ingegevenNummer / 1440;
        int uren = (ingegevenNummer/60)%24;
        int minuten = ingegevenNummer % 60;

        System.out.println("Aantal dagen: " + dagen);
        System.out.println("Aantal uren: " + uren);
        System.out.println("Aantal minuten: " + minuten);


    }
}
