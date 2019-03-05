package be.intecbrussel.Hoofdstuk11.EnumPersoon;
import static be.intecbrussel.Hoofdstuk11.EnumPersoon.Bloodtype.*;

public class Patient extends Persoon{
    Bloodtype bloodtype;


    public Patient() {
    }

    public Patient(Bloodtype bloodtype) {
        this.bloodtype = bloodtype;
    }

    public Bloodtype getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(Bloodtype bloodtype) {
        this.bloodtype = bloodtype;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "bloodtype= " + bloodtype +
                '}';
    }
}
