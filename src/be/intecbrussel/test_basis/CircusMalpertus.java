package be.intecbrussel.test_basis;

import java.util.Scanner;

public class CircusMalpertus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wekom bij Malpertus!");

        int basisPrijsTicket = 25;
        int voormiddagPrijsTicket = basisPrijsTicket - ((basisPrijsTicket * 15) / 100);

        System.out.println("Geef je leeftijd in: ");
        int leeftijdVanDeKlant = input.nextInt();

        System.out.println("1. Maandag, 2.Dinsdag, 3.Woensdag, 4.Donderdag, 5.Vrijdag, 6.Zaterdag, 7.Zondag");
        int startDag = input.nextInt();

        switch (startDag) {
                case 1:
                    System.out.println("Je hebt Maandag gekozen");
                    System.out.println("1.Voormiddag, 2.Namiddag");
                    int voormiddagskortingMaandag = input.nextInt();
                    switch (voormiddagskortingMaandag){
                        case 1:
                            System.out.println("Je hebt Voormiddag gekozen");
                            if (leeftijdVanDeKlant<=12){
                                System.out.println("Kinderen onder 12 jaar mogen gratis binnen");
                            } else if(leeftijdVanDeKlant>12 && leeftijdVanDeKlant<65 ){
                                System.out.println("Totaalprijs = " + voormiddagPrijsTicket);
                            } else if (leeftijdVanDeKlant>=65){
                                basisPrijsTicket = basisPrijsTicket - ((basisPrijsTicket * 45) / 100);
                                System.out.println("Totaalprijs is: " + basisPrijsTicket);
                            }

                            break;
                        case 2:
                            System.out.println("Je hebt Namiddag gekozen");
                            if (leeftijdVanDeKlant<=12){
                                System.out.println("Kinderen onder 12 jaar mogen gratis binnen");
                            } else if(leeftijdVanDeKlant>12 && leeftijdVanDeKlant<65 ){
                                System.out.println("Totaalprijs = " + basisPrijsTicket);
                            } else if (leeftijdVanDeKlant>=65){
                                basisPrijsTicket = basisPrijsTicket - ((basisPrijsTicket * 30) / 100);
                                System.out.println("Totaalprijs is: " + basisPrijsTicket);
                            }
                            break;
                        default:
                            System.out.println("Verkeerde invoer");

                    }



                    break;
                case 2:
                    System.out.println("Je hebt Dinsdag gekozen");
                    System.out.println("1.Voormiddag, 2.Namiddag");
                    int voormiddagskortingDinsdag = input.nextInt();
                    switch (voormiddagskortingDinsdag){
                        case 1:
                            System.out.println("Je hebt Voormiddag gekozen");
                            if (leeftijdVanDeKlant<=12){
                                System.out.println("Kinderen onder 12 jaar mogen gratis binnen");
                            } else if(leeftijdVanDeKlant>12 && leeftijdVanDeKlant<65 ){
                                System.out.println("Totaalprijs = " + voormiddagPrijsTicket);
                            } else if (leeftijdVanDeKlant>=65){
                                basisPrijsTicket = basisPrijsTicket - ((basisPrijsTicket * 45) / 100);
                                System.out.println("Totaalprijs is: " + basisPrijsTicket);
                            }

                            break;
                        case 2:
                            System.out.println("Je hebt Namiddag gekozen");
                            if (leeftijdVanDeKlant<=12){
                                System.out.println("Kinderen onder 12 jaar mogen gratis binnen");
                            } else if(leeftijdVanDeKlant>12 && leeftijdVanDeKlant<65 ){
                                System.out.println("Totaalprijs = " + basisPrijsTicket);
                            } else if (leeftijdVanDeKlant>=65){
                                basisPrijsTicket = basisPrijsTicket - ((basisPrijsTicket * 30) / 100);
                                System.out.println("Totaalprijs is: " + basisPrijsTicket);
                            }
                            break;
                        default:
                            System.out.println("Verkeerde invoer");
                    }



                    break;
                case 3:
                    System.out.println("Je hebt Woensdag gekozen");
                    System.out.println("1.Voormiddag, 2.Namiddag");
                    int voormiddagskortingWoensdag = input.nextInt();
                    switch (voormiddagskortingWoensdag){
                        case 1:
                            System.out.println("Je hebt Voormiddag gekozen");
                            if (leeftijdVanDeKlant<=12){
                                System.out.println("Kinderen onder 12 jaar mogen gratis binnen");
                            } else if(leeftijdVanDeKlant>12 && leeftijdVanDeKlant<65 ){
                                System.out.println("Totaalprijs = " + voormiddagPrijsTicket);
                            } else if (leeftijdVanDeKlant>=65){
                                basisPrijsTicket = basisPrijsTicket - ((basisPrijsTicket * 45) / 100);
                                System.out.println("Totaalprijs is: " + basisPrijsTicket);
                            }

                            break;
                        case 2:
                            System.out.println("Je hebt Namiddag gekozen");
                            if (leeftijdVanDeKlant<=12){
                                basisPrijsTicket = basisPrijsTicket/2;
                                System.out.println("Kinderen op woensdag namiddag :" + basisPrijsTicket);
                            } else if(leeftijdVanDeKlant>12 && leeftijdVanDeKlant<65 ){
                                System.out.println("Totaalprijs = " + basisPrijsTicket);
                            } else if (leeftijdVanDeKlant>=65){
                                basisPrijsTicket = basisPrijsTicket - ((basisPrijsTicket * 30) / 100);
                                System.out.println("Totaalprijs is: " + basisPrijsTicket);
                            }
                            break;
                        default:
                            System.out.println("Verkeerde invoer");
                    }

                    break;
                case 4:
                    System.out.println("Je hebt Donderdag gekozen");
                    System.out.println("1.Voormiddag, 2.Namiddag");
                    int voormiddagskortingDonderdag = input.nextInt();
                    switch (voormiddagskortingDonderdag){
                        case 1:
                            System.out.println("Je hebt Voormiddag gekozen");
                            if (leeftijdVanDeKlant<=12){
                                System.out.println("Kinderen onder 12 jaar mogen gratis binnen");
                            } else if(leeftijdVanDeKlant>12 && leeftijdVanDeKlant<65 ){
                                System.out.println("Totaalprijs = " + voormiddagPrijsTicket);
                            } else if (leeftijdVanDeKlant>=65){
                                basisPrijsTicket = basisPrijsTicket - ((basisPrijsTicket * 45) / 100);
                                System.out.println("Totaalprijs is: " + basisPrijsTicket);
                            }

                            break;
                        case 2:
                            System.out.println("Je hebt Namiddag gekozen");
                            if (leeftijdVanDeKlant<=12){
                                System.out.println("Kinderen onder 12 jaar mogen gratis binnen");
                            } else if(leeftijdVanDeKlant>12 && leeftijdVanDeKlant<65 ){
                                System.out.println("Totaalprijs = " + basisPrijsTicket);
                            } else if (leeftijdVanDeKlant>=65){
                                basisPrijsTicket = basisPrijsTicket - ((basisPrijsTicket * 30) / 100);
                                System.out.println("Totaalprijs is: " + basisPrijsTicket);
                            }
                            break;
                        default:
                            System.out.println("Verkeerde invoer");
                    }



                    break;
                case 5:
                    System.out.println("Je hebt Vrijdag gekozen");
                    System.out.println("1.Voormiddag, 2.Namiddag");
                    int voormiddagskortingVrijdag = input.nextInt();
                    switch (voormiddagskortingVrijdag){
                        case 1:
                            System.out.println("Je hebt Voormiddag gekozen");
                            if (leeftijdVanDeKlant<=12){
                                System.out.println("Kinderen onder 12 jaar mogen gratis binnen");
                            } else if(leeftijdVanDeKlant>12 && leeftijdVanDeKlant<65 ){
                                System.out.println("Totaalprijs = " + voormiddagPrijsTicket);
                            } else if (leeftijdVanDeKlant>=65){
                                basisPrijsTicket = basisPrijsTicket - ((basisPrijsTicket * 45) / 100);
                                System.out.println("Totaalprijs is: " + basisPrijsTicket);
                            }

                            break;
                        case 2:
                            System.out.println("Je hebt Namiddag gekozen");
                            if (leeftijdVanDeKlant<=12){
                                System.out.println("Kinderen onder 12 jaar mogen gratis binnen");
                            } else if(leeftijdVanDeKlant>12 && leeftijdVanDeKlant<65 ){
                                System.out.println("Totaalprijs = " + basisPrijsTicket);
                            } else if (leeftijdVanDeKlant>=65){
                                basisPrijsTicket = basisPrijsTicket - ((basisPrijsTicket * 30) / 100);
                                System.out.println("Totaalprijs is: " + basisPrijsTicket);
                            }
                            break;
                        default:
                            System.out.println("Verkeerde invoer");
                    }



                    break;
                case 6:
                    System.out.println("Je hebt Zaterdag gekozen");
                    System.out.println("1.Voormiddag, 2.Namiddag");
                    int voormiddagskortingZaterdag = input.nextInt();
                    switch (voormiddagskortingZaterdag){
                        case 1:
                            System.out.println("Je hebt Voormiddag gekozen");
                            if (leeftijdVanDeKlant<=12){
                                basisPrijsTicket = basisPrijsTicket/2;
                                System.out.println("Kinderen op woensdag namiddag :" + basisPrijsTicket);
                            } else if(leeftijdVanDeKlant>12 && leeftijdVanDeKlant<65 ){
                                System.out.println("Totaalprijs = " + voormiddagPrijsTicket);
                            } else if (leeftijdVanDeKlant>=65){
                                basisPrijsTicket = basisPrijsTicket - ((basisPrijsTicket * 45) / 100);
                                System.out.println("Totaalprijs is: " + basisPrijsTicket);
                            }

                            break;
                        case 2:
                            System.out.println("Je hebt Namiddag gekozen");
                            if (leeftijdVanDeKlant<=12){
                                basisPrijsTicket = basisPrijsTicket/2;
                                System.out.println("Kinderen op woensdag namiddag :" + basisPrijsTicket);
                            } else if(leeftijdVanDeKlant>12 && leeftijdVanDeKlant<65 ){
                                System.out.println("Totaalprijs = " + basisPrijsTicket);
                            } else if (leeftijdVanDeKlant>=65){
                                basisPrijsTicket = basisPrijsTicket - ((basisPrijsTicket * 30) / 100);
                                System.out.println("Totaalprijs is: " + basisPrijsTicket);
                            }
                            break;
                        default:
                            System.out.println("Verkeerde invoer");
                    }



                    break;

                case 7:
                    System.out.println("Je hebt Zondag gekozen");
                    System.out.println("1.Voormiddag, 2.Namiddag");
                    int voormiddagskortingZondag = input.nextInt();
                    switch (voormiddagskortingZondag){
                        case 1:
                            System.out.println("Je hebt Voormiddag gekozen");
                            if (leeftijdVanDeKlant<=12){
                                basisPrijsTicket = basisPrijsTicket/2;
                                System.out.println("Kinderen op woensdag namiddag :" + basisPrijsTicket);
                            } else if(leeftijdVanDeKlant>12 && leeftijdVanDeKlant<65 ){
                                System.out.println("Totaalprijs = " + voormiddagPrijsTicket);
                            } else if (leeftijdVanDeKlant>=65){
                                basisPrijsTicket = basisPrijsTicket - ((basisPrijsTicket * 45) / 100);
                                System.out.println("Totaalprijs is: " + basisPrijsTicket);
                            }

                            break;
                        case 2:
                            System.out.println("Je hebt Namiddag gekozen");
                            if (leeftijdVanDeKlant<=12){
                                basisPrijsTicket = basisPrijsTicket/2;
                                System.out.println("Kinderen op woensdag namiddag :" + basisPrijsTicket);
                            } else if(leeftijdVanDeKlant>12 && leeftijdVanDeKlant<65 ){
                                System.out.println("Totaalprijs = " + basisPrijsTicket);
                            } else if (leeftijdVanDeKlant>=65){
                                basisPrijsTicket = basisPrijsTicket - ((basisPrijsTicket * 30) / 100);
                                System.out.println("Totaalprijs is: " + basisPrijsTicket);
                            }
                            break;
                        default:
                            System.out.println("Verkeerde invoer");
                    }



                    break;

                default:
                    System.out.println("Verkeerde invoer");



            }



    }
}
