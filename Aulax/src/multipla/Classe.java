package multipla;

public class Classe extends ClasseA implements InterfaceB, InterfaceC {
	
	@Override
	public String letraB() {
		return getTexto() + " + B";
	}
	
	@Override
	public String letraC() {
		return getTexto() + " + C";
	}
	
	@Override
	public int numeroB() {
		return getNumero() + 1;
	}
	
	@Override
	public int numeroC() {
		return getNumero() + 2;
	}

}
