package entities;

public class Caminhao extends Veiculo {

	
	public Caminhao() {
		super();
	}

	public Caminhao(String modelo, Integer year, Double valorBaseManutencao) {
		super(modelo, year, valorBaseManutencao);
		
	}


	@Override
	public Double calcularCustoManutencao() {
		
		return getValorBaseManutencao() + 500;
	}

}
