
public class Funcionario {
	String nome;//Atributos da classe Pessoa.
	double salario;
	//Adiciona um valor ao salário base do funcionário
	public void aplicarBonusAoSalario(double valor) {
		salario += valor;
	}
	public void exibirDadosDoFuncionario() {
		System.out.println("Funcionário " + nome);
		System.out.println("Salário atual é: "+ salario);
	}
	
}
