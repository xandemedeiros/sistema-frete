package sistema_frete;

public class Carro extends Veiculo implements Fretavel {

	public Carro(String placa, int ano) {
		super(placa, ano);
	}
	
	public double calcularCustoFrete(double distanciaEmKm) {
		return distanciaEmKm * 1.25;
	}
}
