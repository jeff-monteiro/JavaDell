package Auto;

public class Teste {
	public static void main(String[]args) {
		Carro carro = new Carro();//Método Construtor.
		//Definição dos valores utilizando o método SET.
		carro.setPeso(500);
		carro.setCor("Amarelo");
		carro.setPreco(35000);
		carro.setQuantidadeDePortas(4);
		carro.exibir();
	}
}
