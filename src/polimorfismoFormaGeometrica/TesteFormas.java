package polimorfismoFormaGeometrica;

import java.util.Scanner;

public class TesteFormas {
	public static void desenhar(FormaGeometrica f) {
		
		//Chamada Polimórfica
		System.out.println(f.representacao);
	}
	public static void main(String[] args) {
		
		//Definido os atributos necessários
		Scanner entrada = new Scanner(System.in);
		int opc;
		System.out.println("Digite a opção de figurada desejada: \n - Quadrado" + "\n - Triangulo");
		opc = entrada.nextInt();
		
		//Instanciando objetos de subclasses para referências da superclasse
		if(opc == 1)
			desenhar(new Quadrado());
			else if(opc == 2)
			desenhar(new Triangulo());
			else
			desenhar(new FormaGeometrica());
			
		
	}
}
