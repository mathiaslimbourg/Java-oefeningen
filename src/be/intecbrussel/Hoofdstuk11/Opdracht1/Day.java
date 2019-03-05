package be.intecbrussel.Hoofdstuk11.Opdracht1;

public enum Day {
    MAANDAG(true),
    DINSDAG(true),
    WOENSDAG(true),
    DONDERDAG(true),
    VRIJDAG(true),
    ZATERDAG(false),
    ZONDAG(false);

    private boolean weekday;

    Day(boolean weekday) {
        this.weekday = weekday;
    }

    public boolean isWeekday() {
        return weekday;
    }

    @Override
    public String toString() {
        return name() + " " + weekday;
    }
}
