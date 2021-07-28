package polimorfismo;

/* As classes Cavalo, Sapo, Serumano são subclasses a partir da SuperClasse Animal*/

public class Animal {//SuperClasse
	public void moverSe(int qtAndar) {
		System.out.println("Sem forma de mover-se definida \n"+ "Utilize um animal específico.");
	}
}
