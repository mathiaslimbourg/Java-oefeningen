package be.intecbrussel.test_basis;
import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Schrijf hier je zin: ");
        String opgegevenZin = input.nextLine();

        int count = 1;
        for (int i=0;i<=opgegevenZin.length()-1;i++)
        {
            if (opgegevenZin.charAt(i) == ' ')
            {
                count++;
            }

        }
        if (count<=1){
            System.out.println("Er is maar " + count + " woord ingegeven");
        } else {
            System.out.println("Je zin heeft " + count + " aantal woorden.");
        }


    }


}
