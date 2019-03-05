package be.intecbrussel.Hoofdstuk11.Opdracht1;

public class DayApp {
    public static void main(String[] args) {
        Day[] listOfDays = Day.values();

        for (Day d : listOfDays){
            System.out.println(d.toString());
        }
    }
}
