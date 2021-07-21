package aula06;

public class Aluno {
	private String matricula;
	public Aluno(String nome, String matricula) {
		super();
		this.matricula = matricula;
	}
	public String toString() {
		return super.toString() + "(Professor)" + "\n Matricula" + matricula;
	}
}
