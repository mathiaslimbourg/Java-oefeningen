package be.intecbrussel.Hoofdstuk11.EnumPersoon;

public class PersoonApp {
    public static void main(String[] args) {
        Persoon matte = new Persoon("Matte",22,90,Gender.MAN);
        Persoon maarten = new Persoon("Maarten",21,230,Gender.WOMAN);

        Patient anneke = new Patient(Bloodtype.AB);


        System.out.println(matte);
        System.out.println(maarten);
        System.out.println(anneke);
    }
}
