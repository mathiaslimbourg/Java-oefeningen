package be.intecbrussel.EenvoudigeKlassen;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeApp {
    public static void main(String[] args) {
        LocalDateTime nowDateTime = LocalDateTime.now();

        LocalDate birthday = LocalDate.of(1996,06,8);

        long days = ChronoUnit.DAYS.between(birthday,nowDateTime);
        long years = ChronoUnit.YEARS.between(birthday,nowDateTime);
        long months = ChronoUnit.MONTHS.between(birthday,nowDateTime);
        System.out.println("Dagen tussen nu en geboorte");
        System.out.println(days);
        System.out.println("Maanden tussen nu en geboorte");
        System.out.println(months);
        System.out.println("Jaren tussen nu en geboorte");
        System.out.println(years);

        int DagOfYear = birthday.getDayOfYear();
        System.out.println("Geboren op aantal dag van het jaar 1996");
        System.out.println(DagOfYear);

        int dagOfMonth = birthday.getDayOfMonth();
        System.out.println("Geboren op deze maand uit 1996");
        System.out.println(dagOfMonth);

        DayOfWeek dagOfWeek = birthday.getDayOfWeek();
        System.out.println("geboren op deze dag in 1996");
        System.out.println(dagOfWeek);









    }



}
