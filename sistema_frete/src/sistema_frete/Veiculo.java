package sistema_frete;

public abstract class Veiculo {
	
	private String placa;
	private int ano;
	
	public Veiculo(String placa, int ano) {
		this.placa = placa;
		this.ano = ano;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public int getAno() {
		return ano;
	}

}
