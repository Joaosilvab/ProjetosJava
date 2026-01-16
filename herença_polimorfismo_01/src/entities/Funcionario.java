package entities;

public abstract class Funcionario {
	
	private String name;
	private Double salarioBase;
	
	public Funcionario() {
	}

	public Funcionario(String name, Double salarioBase) {
		this.name = name;
		this.salarioBase = salarioBase;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	} 
	
	public void mostrarDados() {
		 System.out.println("Nome: "+ getName() + " , Salário Total: " + calcularSalario());
	}
	
	public abstract Double calcularSalario();

	
}
