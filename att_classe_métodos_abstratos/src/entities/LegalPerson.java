package entities;

public class LegalPerson extends Person {

	private int NumerodeFuncionarios;
	
	public LegalPerson() {
		super();
	}
	
	public LegalPerson(String name, Double annualIncome, int numerodeFuncionarios) {
		super(name, annualIncome);
		NumerodeFuncionarios = numerodeFuncionarios;
	}

	
	public int getNumerodeFuncionarios() {
		return NumerodeFuncionarios;
	}

	public void setNumerodeFuncionarios(int numerodeFuncionarios) {
		NumerodeFuncionarios = numerodeFuncionarios;
	}

	
	@Override
	public Double imposto() {
		if(NumerodeFuncionarios <= 10) {
			return (getAnnualIncome() * 16.0) / 100;
		}
		else { 
			return (getAnnualIncome() * 14.0) / 100; 
		}
		
	}

	
	
}
