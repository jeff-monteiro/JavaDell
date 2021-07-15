package Auto;

public class Automovel {
	float peso;
	String cor;
	float preco;
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getPeso() {
		return peso;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getPreco() {
		return preco;
	}
	public void exibir() {
		System.out.println("Peso: "+ this.getPeso());
		System.out.println("Cor: "+ this.getCor());
		System.out.println("Preço: "+ this.getPreco());
	}
}
