package sobrecargaOficina;

public class PrincipalOficina {
	public static void main(String[] args) {
		Produto produto = new Produto("Arroz", 2.89, 5, 1.20);
		System.out.println("Produto: "+ produto.getNome());
		System.out.println("Valor: "+ produto.getValor());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Desconto: " + produto.getValorDesconto());
		
//		Produto produto = new Produto();
//		produto.Produto("Feijão", 2.90, 1, 0.25);
		
		
	}
}
