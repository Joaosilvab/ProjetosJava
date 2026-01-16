package entities;

public class Estagiario extends Funcionario{

	
	
	public Estagiario() {
		super();
	}
	

	public Estagiario(String name, Double salarioBase) {
		super(name, salarioBase);
	}


	@Override
	public Double calcularSalario() {
		return getSalarioBase();
	}

}
