package aula06;

public class Aluno extends Pessoa{
	private String matricula;
	public Aluno(String nome, String matricula) {
		super(nome);
		this.matricula = matricula;
	}
	public String toString() {
		return super.toString() + "(Professor)" + "\n Matricula" + matricula;
	}
}
