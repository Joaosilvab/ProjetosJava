package entities;

public class Banco {

	private int nconta; 
	private String name;
	private double depo; 
	
	public Banco(int nconta, String name, double depo) {
		this.nconta = nconta;
		this.name = name;
		this.depo = depo;
	}
	
	public Banco(int nconta, String name) {
		super();
		this.nconta = nconta;
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNconta() {
		return nconta;
	}
	
	public double getDepo() {
		return depo;
	}
	
	
	public void depostio(double depo) {
		this.depo += depo;
	}

	public void saque(double saq) {
		depo -= saq;
		depo -= 5.0;
	}


	
	public String toString() {
		return "Account " 
	           + getNconta()  
	           + ", Holder: "
	           + getName() 
	           + ", Balance: $ "
	           + depo; 
	}
}
