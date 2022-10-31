package Composite;

import java.util.*;

public class Picture extends Graphic {
    ArrayList<Graphic> graphics = new ArrayList<>();

    public Picture(String graphics) {
        this.graphic = graphic;
    }

    @Override
    public void draw() {
        for (Graphic gc : graphics) {
            gc.draw();
        }
    }

    @Override
    public void add(Graphic graphic) throws Exception {
        this.graphics.add(graphic);
    }

    @Override
    public void remove(Graphic graphic) throws Exception {
        for (Graphic gc : graphics) {
            if (gc == graphic) {
                this.graphics.remove(gc);
                return;
            }
        }
        throw new Exception("Não existe esse arquivo");
    }

    @Override
    public Graphic GetChild(int child) throws Exception {
        return this.graphics.get(child);
    }
}
