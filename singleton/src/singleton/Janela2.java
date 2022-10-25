package singleton;

public class Janela2 {
	private static Janela2 instancia;
	
	private Janela2() {
		
	}

	public static synchronized Janela2 getInstance() {
		if (instancia == null) {
			instancia = new Janela2();
		}
		return instancia;
	}
}
