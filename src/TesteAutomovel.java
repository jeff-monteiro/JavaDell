
public class TesteAutomovel {
	public static void main(String[] args) {
		/*Usando o primeiro construtor e definindo os demais  atributos
		 * com auxilio de métodos Set.*/
		Automovel auto01 = new Automovel("Ferrari");
		auto01.setQuantidadeDePassageiros(5);
		auto01.setCombustivel("Gasolina");
		
		/*Usando o segundo construtor */
		Automovel auto02 = new Automovel("Trator", "Oleo Diesel", 1);
		/*Acessando as informações de cada automóvel com métodos Get. */
		System.out.println(auto01.getNome() + " - utiliza " + auto01.getCombustivel());
		System.out.println(auto02.getNome() + " - transporta " + auto02.getQuantidadeDePassageiros() + " pessoa(s).");
	}
}
