package aula06;

public class Professor extends Pessoa{
	private String disciplina;
	private String[] turmas;
	
	public Professor(String nome, String disciplina) {
		super(nome);
		this.disciplina = disciplina;
	}
	public String toString() {
		return super.toString() + "(Aluno)" + "\n (Portuguese)" + disciplina;
	}
}
