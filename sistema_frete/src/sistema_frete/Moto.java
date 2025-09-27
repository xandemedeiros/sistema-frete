package sistema_frete;

public class Moto extends Veiculo implements Fretavel {
	
	public Moto(String placa, int ano) {
		super(placa, ano);
	}
	public double calcularCustoFrete(double distanciaEmKm) {
		return distanciaEmKm * 0.45;
	}
}
