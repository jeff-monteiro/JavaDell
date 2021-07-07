package principal;

import modelos.Aluno;

public class Principal {
	public static void main(String[]args) {
		Aluno aluno = new Aluno("Pedro", 8.75, 6.25);
		System.out.println(aluno.getNome());
		System.out.println(aluno.getNota1());
		System.out.println(aluno.getNota2());
		System.out.println(calcularMedia(aluno.getNota1(), aluno.getNota2()));
	}
	public static double calcularMedia(double nota1, double nota2) {
		return(nota1 + nota2)/2;	
	}
	
	
}
