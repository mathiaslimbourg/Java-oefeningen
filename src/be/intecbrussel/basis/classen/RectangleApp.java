package be.intecbrussel.basis.classen;

public class RectangleApp {
    public static void main(String[] args) {
        System.out.println("This program uses a rectangle");

        Rectangle rect = new Rectangle();
        //Rectangle rect2 = new Rectangle();

        rect.setPosition(7,9);
        rect.setHeight(-7);
        rect.setWidth(-8);
        rect.setX(10);
        rect.setY(10);
        rect.grow(4);



        /*
            rect2.height = 10;
            rect2.width = 15;
            rect2.x = 2;
            rect2.y = 3;
        */

        System.out.println("height: " + rect.getHeight());
        System.out.println("width: " + rect.getWidth());
        System.out.println("x: " + rect.getX());
        System.out.println("y: " + rect.getY());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Position: " + rect.getposition());

        /*
            System.out.println("height: " + rect2.height);
            System.out.println("width: " + rect2.width);
            System.out.println("x: " + rect2.x);
            System.out.println("y: " + rect2.y);
        */



    }


}
