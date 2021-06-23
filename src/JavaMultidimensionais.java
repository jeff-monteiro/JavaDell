
public class JavaMultidimensionais {
	public void exemplo3(int quantidadeAlunos, int notasPorAluno) {
		
		float notas[][] = new float[quantidadeAlunos][notasPorAluno];
		
		for(int i = 0; i < quantidadeAlunos; i++) {
			System.out.println("Notas do Aluno " + (i + 1));
			for(int j = 0; j < notasPorAluno; j++) {
				float temp = 0;
				System.out.println("informe a nota " +(j+1) + " do Aluno " +(i+1) + ": ");
				/* Considere que o usuário irá formecer um valor para a variável temp aqui: */         
                /* Atribuição da nota j para aluno i */
				notas[i][j] = temp;
			}
		}
	}
}
