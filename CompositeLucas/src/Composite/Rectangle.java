package Composite;

public class Rectangle extends Graphic{
    public Rectangle(String graphic) {
        this.graphic = graphic;
    }

    public void draw() {
        System.out.println(this.graphic);
    }
}
