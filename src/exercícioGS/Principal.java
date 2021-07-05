package exercícioGS;

public class Principal {
	public static void main(String[] args) {
		Aluno alunoLead = new Aluno("Jefferson", 488856, 7.1, 9.2);
		System.out.println(alunoLead.getNome());
		System.out.println(alunoLead.getCodigo());
		System.out.println(alunoLead.getNota1());
		System.out.println(alunoLead.getNota2());
	}
}
