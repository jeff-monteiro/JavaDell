
public class TestePessoa {
		public static void main(String[]args) {
			/*Criando um objeto para representar José de 32 anos*/
			Pessoa jose = new Pessoa();
			jose.nome = "José";
			
			/*Criando um objeto para representar Lara de 25 anos*/
			Pessoa lara = new Pessoa();//Método construtor
			lara.nome = "Lara";
			
			/*Fazendo ambos os objetos executar o método apresetar()*/
			jose.apresentar();
			lara.apresentar();
	}
}

