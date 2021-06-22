
public class MetodosJava {
		
		/*Todos os MÉTODOS estão declarados com palavra-chave STATIC, que indica
		 * que os MÉTODOS serão acessados através de um contexto stático. Assim não
		 * existe a necessidade de se instanciar uma classe.
		 */
		
		public static void metodo1(){
			System.out.println("Este é um método que não retorna valor devido por causa da  palavra-chave VOID.");
		}
		
		public static int metodo2() {
			System.out.println("Este método retorna um valor inteiro");
			return 1;
		}
		
		public static void metodo3(String nome, int idade) {
			System.out.println("Este método não retorna valor");
			System.out.println("Recebe dois parâmetros");
			System.out.println("Uma string nome: " + nome);
			System.out.println("Um inteiro idade: " + idade);
		}
		public static void main(String[] args) {
			metodo1();
			System.out.println("O valor retornado pelo método2 é: " + metodo2());
			metodo3("Rafael", 26);
		}
}

