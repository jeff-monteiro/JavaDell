package Auto;

public class Carro extends Automovel{
	int quantidadeDePortas;
	
	public void setQuantidadeDePortas(int quantidadeDePortas) {
		this.quantidadeDePortas = quantidadeDePortas;
	}
	public int getQuantidadeDePortas() {
		return quantidadeDePortas;
	}
	public void exibir() {
		super.exibir();
		System.out.println("Quantidade de Portas: "+ this.getQuantidadeDePortas());
	}

}
