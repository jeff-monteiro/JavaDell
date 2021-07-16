package recursoshumanos;

public class Funcionario {
	  public long cpf;
	  public double salario;
	  public double desconto;
	  
	  public void setCpf(long cpf){
	   this.cpf = cpf;
	  }
	  public long getCpf(){
	   return cpf;
	  }
	  public void setSalario(double salario){
	   this.salario = salario;
	  }
	  public double getSalario(){
	   return salario;
	  }
	  public void setDesconto(double desconto){
	   this.desconto = desconto;
	  }
	  public double getDesconto(){
	   return desconto;
	  }
	  public Funcionario(long cpf, double salario, double desconto){
	     this.cpf = cpf;
	     this.salario = salario;
	     this.desconto = desconto;
	  }
	  public static double calcularSalario(double salario, double desconto) {
		  return(salario - desconto);
	  }
	  
}
