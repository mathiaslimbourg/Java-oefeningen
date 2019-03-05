package be.intecbrussel.test_basis;
import java.util.Arrays;
import java.util.Scanner;

public class HarryDeArray {
    public static void main(String[] args) {
        //todo schrijf een programma dat de kleinst en het 2de kleinste elment uit de lijst haalt. (geen sorteren)

       /* int[] lijst = {5, 84, 16, 20, 10};

        for (int i = 0; i < lijst.length; i++) {
            int min = i;
            for (int j = i+1;j<lijst.length;j++){
                if (lijst[j]<lijst[min]){
                    min = j;
                }
            }
            int temp = lijst[min];
            lijst[min] = lijst[i];
            lijst[i] = temp;
        }
        System.out.println(lijst[0]);
        System.out.println(lijst[1]);
        System.out.println(lijst[2]);*/



       //todo nieuwe oefening
        int[] oldArray = {5,3,7,9};
        int[] newArray = shiftArrayRight(oldArray);
        printArray(newArray);
    }
    //Takes in an array of integers then return a new array
    //with all the values shifted right
    public static int[] shiftArrayRight(int[]array1){
        int[] array2 = new int[array1.length]; //duplicate the array
        //copy the i'th element from array 1 to the i+1 position in array2
        for (int i = 0; i<array1.length-1;i++){
            array2[i+1] = array1[i];
        }
        //copy the last element from array1 to the first position in array2
        array2[0] = array1[array1.length-1];
        return array2;
    }
    //Takes in the array of integers and prints it to console
    public static void printArray(int[]arr){
        for (int x : arr)
            System.out.println(x + ",");

    }

}
