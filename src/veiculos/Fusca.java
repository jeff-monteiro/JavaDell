package veiculos;

public class Fusca extends Carro{
	public Fusca() {
		qtdPortas = 2;
		potenciaMotor = 2;
	}
	public void acelerar() {
		System.out.println("Fusca Acelerando");
	}
	public void frear() {
		System.out.println("Fusca Freando");
	}
}
