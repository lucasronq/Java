package secretaria;

public class Aluno {
	private double nota1, nota2, notaF;
	private String nome, conceito;

	public Aluno(double nota1, double nota2, double notaF, String nome, String conceito) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.notaF = notaF;
		this.nome = nome;
		this.conceito = conceito;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNotaF() {
		return notaF;
	}

	public void setNotaF(double notaF) {
		this.notaF = notaF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getConceito() {
		return conceito;
	}

	public void setConceito(String conceito) {
		this.conceito = conceito;
	}

	@Override
	public String toString() {
		return "Aluno [nota1=" + nota1 + ", nota2=" + nota2 + ", notaF=" + notaF + ", nome=" + nome + ", conceito="
				+ conceito + "]";
	}
	
	
	
}
