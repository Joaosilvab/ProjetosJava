package entities;

public class Moto extends Veiculo {
	
	
	public Moto() {
		super();
	}

	public Moto(String modelo, Integer year, Double valorBaseManutencao) {
		super(modelo, year, valorBaseManutencao);
	}


	@Override
	public Double calcularCustoManutencao() {
		
		return getValorBaseManutencao() + 100;
	}

}
