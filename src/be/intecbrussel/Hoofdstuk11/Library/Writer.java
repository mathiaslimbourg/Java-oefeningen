package be.intecbrussel.Hoofdstuk11.Library;

public class Writer {
    private String name;

    public Writer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "name='" + name + '\'' +
                '}';
    }
}
