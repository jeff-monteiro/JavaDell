package exercícioGS;

public class Principal {
	public static void main(String[] args) {
		Aluno alunoLead = new Aluno("Jefferson", 488856, 7.1, 9.2);
		System.out.println(alunoLead.getNome());
		System.out.println(alunoLead.getCodigo());
		System.out.println(alunoLead.getNota1());
		System.out.println(alunoLead.getNota2());
		
		//NovoAluno aluno = new NovoAluno("Karoliny", 469582, 6.0, 8.0);
		
	}
//	public static double setCalcular(double nota1, double nota2) {
//		System.out.println("Resultado da média");
//		  return (nota1 + nota2)/2;
//	}
	
}
