package be.intecbrussel.basis.classen;

public class Rectangle {
    public int height;
    public int width;
    public int x;
    public int y;

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String getposition(){
        return x + " " + y;
    }

    public void setHeight(int height){
        this.height = height;
        this.height = height<0?-height:height;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width){
        this.width = width;
        if (this.width<0){
            //todo
        }
    }

    public int getWidth(){
        return width;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void grow(int d){
        d+=d;
    }

    public double getArea(){
        int temp = height*width;
        return temp;
    }
}

