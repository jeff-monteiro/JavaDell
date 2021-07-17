package aplicacoes;

import contas.*;

public class Principal {
	public static void main(String[] args) {
		Conta minhaconta = new Conta();
		minhaconta.saldo = 100;
		System.out.println(minhaconta.saldo);
		
		ContaCorrente conta2 = new ContaCorrente();
		System.out.println(conta2.saldo);
		
		ContaCorrente conta3 = new ContaCorrente(100);
		System.out.println(conta3.saldo);
	}
}
