package sobrecarga;

public class ExemploComissionado {
	private double comissaoPorPeca;
	private int quantidadePecasVendidas;
	
	public double valorDoSalario() {
		return super.valorDoSalario() + comissaoPorPeca * quantidadePecasVendidas;
	}
}
