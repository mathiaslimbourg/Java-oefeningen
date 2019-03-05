package be.intecbrussel.OverervingEnKlassen;

public abstract class Shape {
    private int count;
    private int x;
    private int y;
    private int width;
    private int height;


    public void shape(){

    }

    public int shape(int x, int y){
        this.x = x;
        this.y = y;
        //todo
        return 0;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
//todo
    /*public abstract double getArea() {
        return width * height;
    }*/





















}

