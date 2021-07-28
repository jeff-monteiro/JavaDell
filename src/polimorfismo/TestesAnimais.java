package polimorfismo;

import java.util.Scanner;
//Exemplo de Polimorfismo.
public class TestesAnimais {
	public static void main(String[]args) {
		//Definição de referência de superclasse
		Animal a;
		System.out.println("1 - Ser Humano \n2 - Cavalo \n3 - Sapo" );
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha uma das opções: ");
		int opc = teclado.nextInt();
		System.out.println("Opção escolhida: " + opc);
		//Instanciando objeto de uma das subclasses para referência da superclasse
		if(opc == 1) 
			a = new SerHumano();
		else	
			if(opc == 2)
				a = new Cavalo();
			else
				if(opc == 3)
					a = new Sapo();
				else
					a = new Animal();
				
		a.moverSe(2);	
	}
}	
		
		//Instanciando um objeto a partir de uma classe
//		Animal a1 = new Animal();
//		
//		//Instanciando objetos de subclasses para referências de superclasse
//		Animal a2 = new Cavalo();
//		Animal a3 = new Sapo();
//		Animal a4 = new SerHumano();
//		
//		a1.moverSe(2);
//		a2.moverSe(2);
//		a3.moverSe(2);
//		a4.moverSe(2);
