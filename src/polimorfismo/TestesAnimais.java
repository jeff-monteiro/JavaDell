package polimorfismo;

public class TestesAnimais {
	public static void main(String[]args) {
		//Instanciando um objeto a partir de uma classe
		Animal a1 = new Animal();
		
		//Instanciando objetos de subclasses para referências de superclasse
		Animal a2 = new Animal();
		Animal a3 = new Animal();
		Animal a4 = new Animal();
		
		a1.moverSe(2);
		a2.moverSe(2);
		a3.moverSe(2);
		a4.moverSe(2);
	}
}
