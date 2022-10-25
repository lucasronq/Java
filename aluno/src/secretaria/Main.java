package secretaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		String conceito  = cf
		ArrayList<Aluno>alunos = new ArrayList<>();
		
		System.out.print("Digite o numero de alunos que deseja cadastrar: ");
		Scanner sc = new Scanner(System.in);
		int numAlunos = sc.nextInt();
		for (int i = 1; i <= numAlunos; i++) {
		System.out.println(" ");
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		System.out.println("Digite sua primeira nota: ");
		double nota1 = Double.parseDouble(sc.next());
		System.out.println("Digite sua segunda nota: ");
		double nota2 = Double.parseDouble(sc.next());
		double notaF = (nota1 + nota2)/2;
		System.out.println(nome);
		System.out.println("Sua nota final é: " + notaF);
		
		if (notaF > 8) {
			System.out.println("Seu conceito é A!");
		}
		else if ((notaF <= 8) && (notaF >=7)){
			System.out.println("Seu conceito é B!");
		}
		else if ((notaF < 7) && (notaF >=6)){
			System.out.println("Seu conceito é C!");
		}
		else {
			System.out.println("Seu conceito é E!");
		}
		
			Aluno aluno = new Aluno();
			aluno.setNome(nome);
			aluno.setNota1(nota1);
			aluno.setNota2(nota2);
			aluno.setNotaF(notaF);
			aluno.setConceito(cf);
			alunos.add(aluno);
		}	
		sc.close();
		
		for (int i = 0; i < alunos.size(); i++) {
			
			System.out.println(alunos.get(i).nome);
			System.out.println(alunos.get(i).notaF);
			System.out.println(alunos.get(i).cf);			
		}
	}
}
