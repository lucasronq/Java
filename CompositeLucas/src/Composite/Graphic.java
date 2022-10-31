package Composite;

public class Graphic {

    String graphic;

    public void draw() {
        System.out.println(this.graphic);
    }

    public void add(Graphic graphic) throws Exception {
        throw new Exception("Não pode desenhar");
    }

    public void remove(Graphic graphic) throws Exception {
        throw new Exception("Não pode remover");
    }

    public Graphic GetChild(int child) throws Exception{
        throw new Exception("Não pode pegar filho");
    }
}
