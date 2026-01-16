package entities;

public abstract class Veiculo {

	private String modelo;
	private Integer year;
	private Double valorBaseManutencao;
	
	public Veiculo() {
	}

	public Veiculo(String modelo, Integer year, Double valorBaseManutencao) {
		super();
		this.modelo = modelo;
		this.year = year;
		this.valorBaseManutencao = valorBaseManutencao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String name) {
		this.modelo = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Double getValorBaseManutencao() {
		return valorBaseManutencao;
	}

	public void setValorBaseManutencao(Double valorBaseManutencao) {
		this.valorBaseManutencao = valorBaseManutencao;
	}
	
	public abstract Double calcularCustoManutencao();
	
	
	public void mostraDados() {
		
		System.out.println("Modelo: " + getModelo() + " - Ano: " + getYear() + " - Custo Manutenção: " + calcularCustoManutencao());
		
	}
	
	
	
}
