package multipla;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplaTeste {

	@Test
	void test01() {
		ClasseD<Classe> classeD = new ClasseD<Classe>();
		Classe testeTexto = new Classe();
		
		System.out.println("Provando o uso");
		testeTexto.setTexto("XXXXXXX");
		System.out.println(classeD.retornaA(testeTexto));
		System.out.println(classeD.retornaB(testeTexto));
		System.out.println(classeD.retornaC(testeTexto));
		
	}
	
	@Test
	void teste02() {
		ClasseD<Classe> classeD = new ClasseD<Classe>();
		Classe testeNumero = new Classe();
		
		System.out.println("Provando o uso");
		testeNumero.setNumero(120);
		System.out.println('\n' + "Numero inicial " + classeD.retornaNumeroA(testeNumero));
		System.out.println("Adicionando + 1 = " + classeD.retornaNumeroB(testeNumero));
		System.out.println("Adicionando + 2 = " + classeD.retornaNumeroC(testeNumero));
	}
}
