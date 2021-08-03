package sobrecargaOficina;

public class Produto {
	private String nome;
	private double valor;
	private int quantidade;
	private double valorDesconto;
	
	public Produto() {
		
	}
	public Produto(String nome, double valor, int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
	public void setQuanntidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public Produto(String nome, double valor, int quantidade, double valorDesconto) {//método construtor com parâmetro *valorDesconto*
		this.valorDesconto = valorDesconto;
	}
	public void setValorDesconto(int valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	public double getValorDesconto() {
		return valorDesconto;
	}

}
