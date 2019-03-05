package be.intecbrussel.test_basis;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        //todo oefening 1
       /* int[] numbers = new int[20];
        int veelVoud = 7;

        for (int i = 0; i < numbers.length;i++){
            numbers[i] = veelVoud;
            veelVoud+=7;
        }

        for (int i : numbers){
            System.out.println(i);
        }


        System.out.println("AANSCHOUW");
        for (int i = numbers.length-1; i>=0;i--){
            System.out.println(numbers[i]);
        }*/


        //todo oefening 2
        /*int[][] array2d = {{3,6,7,8},{2,1},{8,0,5,4,2},{4,6,9}};

        for (int i = 0;i<array2d.length;i++){
            for (int j = 0;j<array2d[i].length;j++){
                System.out.println(array2d[i][j]);
            }
        }*/

        //todo oefening 3 & Elementen van plaats veranderen
        int[] Array1 = {10,20,30,40,50};
        test(Array1,1,2);


    }

    private static void test(int[] array1, int element1, int element2) {
        int temp = array1[element1];
        array1[element1] = array1[element2];
        array1[element2] = temp;

        for (int i = 0; i<array1.length;i++){
            System.out.println(array1[i]);
        }

    }


}
