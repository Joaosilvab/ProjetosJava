package entities;

public class Carro extends Veiculo {


	public Carro() {
		super();
	}


	public Carro(String modelo, Integer year, Double valorBaseManutencao) {
		super(modelo, year, valorBaseManutencao);
	}


	@Override
	public Double calcularCustoManutencao() {
		return getValorBaseManutencao() + 200;
	}

}
