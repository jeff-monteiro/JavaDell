
public class ExemploMetodos {
  public static double somar(double valor_1,double valor_2) {
	  return (valor_1 + valor_2);
  }
  public static double subtrair(double valor_1,double valor_2) {
	  return (valor_1 - valor_2);  
  }
  public static double multiplicar(double valor_1,double valor_2) {
	  return (valor_1 * valor_2); 
  }
  public static double dividir(double valor_1,double valor_2) {
	  return (valor_1 / valor_2); 
  }
  public static void main(String[] args) {
	 System.out.println(somar(2.9, 4.7));
	 System.out.println(subtrair(3.0, 1.5));
	 System.out.println(multiplicar(2.0, 3.0));
	 System.out.println(dividir(6.0, 2.0));
  }
}
