package entities;

public class ContaBancaria {
	
	private double saldo;
	private int numerodaConta;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumerodaConta() {
		return numerodaConta;
	}

	public void setNumerodaConta(int numerodaConta) {
		this.numerodaConta = numerodaConta;
	}

	public ContaBancaria(double saldo, int numerodaConta) {
		super();
		this.saldo = saldo; 
		this.numerodaConta = numerodaConta;
	}

	public void depositar(double saldo) {
		this.saldo += saldo;
	}
	
	public void sacar(double sacar) {
		this.saldo -= sacar;
		System.out.printf("Seu saldo agora é: %.2f%n", saldo);
	}
	
	public void VerificarSaldo() {
		
		System.out.printf("O saldo da conta N: %d é: %.2f%n", numerodaConta, this.saldo);
	}
	
	
	
	

}
