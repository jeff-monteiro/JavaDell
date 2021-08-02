package sobrecarga;

public class TesteQ {
 public static void main(String[]args) {
	 Quadrado q1 = new Quadrado();
	 Quadrado q2 = new Quadrado(10, 15);
	 Quadrado q3 = new Quadrado(20, 30, 50);
	 Quadrado q4 = new Quadrado(q3);
 }
}
