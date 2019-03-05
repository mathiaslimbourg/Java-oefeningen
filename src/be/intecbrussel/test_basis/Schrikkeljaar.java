package be.intecbrussel.test_basis;

import java.util.Scanner;

public class Schrikkeljaar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geef een jaargetal in");
        int temp = input.nextInt();
        int jaar = temp;
        boolean schrikkeljaar = false;

        if(jaar % 4 == 0) {
            if( jaar % 100 == 0) {
                if ( jaar % 400 == 0){
                    schrikkeljaar = true;
                } else {
                    schrikkeljaar = false;
                }
            } else {
                schrikkeljaar = true;
            }
        } else {
            schrikkeljaar = false;
        }
        if(schrikkeljaar){
            System.out.println(jaar + " is een schrikkeljaar");
        } else {
            System.out.println(jaar + " is geen schrikkeljaar");
        }

    }
}
