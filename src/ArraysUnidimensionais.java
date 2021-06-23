
public class ArraysUnidimensionais {
		public void exemplo2() {
			
			/* Array (vetor) de inteiros, com tamanho igual 50 */
			int numeros[] = new int[50];
			
			/* Laço 'for' que preenche o vetor com valores de 0 a 50
			 * sempre aumentando de 10 em 10 unidades
			*/
			for (int i = 0; i <= numeros.length; i++) {
				numeros[i] = i * 10;
			}
		}
	
}
