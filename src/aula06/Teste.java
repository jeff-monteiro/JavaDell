package aula06;

public class Teste {
	public static void main(String[] args) {
		Pessoa professor = new Professor("Jefferson", "Português");
		Pessoa aluno = new Aluno("João", "124873223");
		
		System.out.println(professor);
		System.out.println(aluno);
	}
	 
//	public class Teste {
//		  public static void main(String[] args){ 
//		  Pessoa professor = new Professor("João", "Matemática");
//		  Pessoa aluno = new Aluno("Rafael", "124873223");
//			*NUNCA UTILIZAR DESSA FORMA*
//		    Pessoa pessoa = new Pessoa("Claudio");
//		    System.out.println("pessoa");
//		  }
//		}
	
}
