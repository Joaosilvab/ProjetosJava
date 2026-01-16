package entities;

public class Desenvolverdor extends Funcionario {
	

	public Desenvolverdor() {
		super();
	}

	
	public Desenvolverdor(String name, Double salarioBase) {
		super(name, salarioBase);
	}



	@Override
	public Double calcularSalario() {
		return getSalarioBase() + (getSalarioBase() * 10.0) / 100.0;
	}

}
