package entities;

public class Gerente extends Funcionario{
	
	public Gerente() {
		super();
	}

	public Gerente(String name, Double salarioBase) {
		super(name, salarioBase);
	}



	@Override
	public Double calcularSalario() {
		return getSalarioBase() + 3000.0;
	}

}
