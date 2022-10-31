package Composite;

public class Line extends Graphic {
    public Line(String graphic) {
        this.graphic =graphic;
    }

    public void draw() {
        System.out.println(this.graphic);
    }
}
