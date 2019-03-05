package be.intecbrussel.EenvoudigeKlassen;

import java.time.DayOfWeek;
import java.util.Scanner;

public class DayOfWeekApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the day of the week 1-7");
        int day = keyboard.nextInt();
        System.out.println("Enter days to add");
        int add = keyboard.nextInt();

        DayOfWeek day1 = DayOfWeek.of(day);

        day1 = day1.plus(add);

        System.out.println(day1);
    }
}
