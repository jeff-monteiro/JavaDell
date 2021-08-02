package sobrecarga;

public class ExemploSobrecarga {
	public int maiorValor(int v1, int v2) {
		if(v1 > v2) return (v1);
		else return (v2);
	}
	public int maiorValor(int v1, int v2, int v3) {
		int maiorTemp = v1;
		if(v2 > maiorTemp) maiorTemp = v2;
		if(v3 > maiorTemp) maiorTemp = v3;
		 return (maiorTemp);
	}
}
