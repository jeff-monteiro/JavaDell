package principal;

import modelos.Aluno;

public class Principal {
	public static void main(String[]args) {
		Aluno aluno = new Aluno("Pedro", 8.75, 6.25);//Instânciação da classe Aluno
		System.out.println(aluno.getNome());//Impressão dos atributos do objeto aluno
		System.out.println(aluno.getNota1());
		System.out.println(aluno.getNota2());
		System.out.println(calcularMedia(aluno.getNota1(), aluno.getNota2()));
	}
	public static double calcularMedia(double nota1, double nota2) {//Método calcularMedia
		return(nota1 + nota2)/2;//Retornar resultado do calculo da Média Aritmética.	
	}
	
	
}
