package Composite;

public class Main {
    public static void main (String[] args) {
        Graphic picture = new Picture("teste");
        Graphic text = new Text("teste");
        Graphic line = new Line("-----");
        Graphic rectangle = new Rectangle("| |");

        try {
            text.add(line);
        } catch (Exception err) {
            System.out.println(err);
        }

        try {
            picture.add(rectangle);
            picture.add(line);
            picture.add(text);
            picture.draw();
        } catch (Exception err) {
            System.out.println(err);
        }
    }
}
