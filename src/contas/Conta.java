package contas;

public class Conta {
	public float saldo;
	public int numeroDaConta;
	
	public void depositar(float valor) {
		if(valor > 0) {
			saldo = saldo + valor;
		}
	}
}
