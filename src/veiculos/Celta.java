package veiculos;

public class Celta extends Carro{
	public Celta(){
		qtdPortas = 4;
		potenciaMotor = 2;
	}
	public void acelerar() {
		System.out.println("Celta Acelerando");
	}
	public void frear() {
		System.out.println("Celta Freando");
	}
}
