package entities;

public class NaturalPerson extends Person {

	private Double gastosComSaude;
	
	public NaturalPerson() {
		super(); 
	}
	
	
	public NaturalPerson(String name, Double annualIncome, double gastosComSaude) {
		super(name, annualIncome);
		this.gastosComSaude = gastosComSaude;
	}


	public double getGastosComSaude() {
		return gastosComSaude;
	}


	public void setGastosComSaude(double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

   
	@Override
	public Double imposto() { 
		if(getAnnualIncome() < 2000.00 && gastosComSaude > 0.0) {
			return (getAnnualIncome() * 15.0 / 100.0 ) - (gastosComSaude * 50.0 / 100.0 ) ; 
		} 
		else if (getAnnualIncome() >= 2000.00 && gastosComSaude > 0.0) {
			return (getAnnualIncome() * 25.0 ) / 100.0 - (gastosComSaude * 50.0) / 100.0;  
		}
		
		else if(getAnnualIncome() < 2000.00 && gastosComSaude == 0.0) {
			return (getAnnualIncome() * 15.0) / 100.0;  
		}
		
		else {
			return (getAnnualIncome() * 25.0) / 100.0;
		}  
		
	}

}
