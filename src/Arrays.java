
public class Arrays {
	/* Array (vetor) de caracteres, com tamanho igual a 4 */
	public void Exemplo1() {
		char letras[];
		letras = new char[4];
	
	/* Adicionando elementos ao Array */
		letras[0] = 'J';
		letras[1] = 'a';
		letras[2] = 'v';
		letras[3] = 'a';
		
	/* Exibição do conteúdo do Array */
		int indice = 0;
		while(indice < 4) {
			System.out.println(letras[indice]);
			indice++;
		}
	}
	
}
