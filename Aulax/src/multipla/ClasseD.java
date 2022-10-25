package multipla;

public class ClasseD <T extends ClasseA & InterfaceB & InterfaceC>{
	
	public String retornaA(T t) {
		return t.getTexto();
	}
	
	public String retornaB(T t) {
		return t.letraB();
	}
	
	public String retornaC(T t) {
		return t.letraC();
	}
	
	public int retornaNumeroA(T t) {
		return t.getNumero();
	}
	
	public int retornaNumeroB(T t) {
		return t.numeroB();
	}
	
	public int retornaNumeroC(T t) {
		return t.numeroC();
	}
}
