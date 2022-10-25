package compose;

import java.util.ArrayList;

public class LinearContainer implements ComponenteVisual{
	
	ArrayList<ComponenteVisual> children = new ArrayList<>();
	
	public void add(ComponenteVisual cv) {
		children.add(cv);
	}
	
	public void remove(ComponenteVisual cv) {
		children.remove(cv);
	}
	
	@Override
	public void desenhar() {
		System.out.println("Desenha o Container");
		for (ComponenteVisual cv : children) {
			cv.desenhar();
		}
	}
}
