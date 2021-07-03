
public class Pessoa { //Classe Pessoa.
	public String nome;//Atributos da classe Pessoa.
	public int idade;
	
	public void andar() {//Ações ou comportamentos da classe.
		System.out.println("Estou caminhando");
	}
	public void falar() {
		System.out.println("bla bla bla");
	}
	public void apresentar() {
		System.out.println("Olá, meu nome é: " + nome);
	}
	
	public class TestePessoa{
		public void main(String[]args) {
			/*Criando um objeto para representar José de 32 anos*/
			Pessoa jose = new Pessoa();
			jose.nome = "José";
			
			/*Criando um objeto para representar Lara de 25 anos*/
			Pessoa lara = new Pessoa();
			lara.nome = "Lara";
			
			/*Fazendo ambos os objetos executar o método apresetar()*/
			jose.apresentar();
			lara.apresentar();
		}
	}
}
