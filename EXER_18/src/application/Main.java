package application;

import java.util.Scanner;

import entities.ContaBancaria;
 
public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria conta = new ContaBancaria(1250, 77); 
		conta.getSaldo();
		conta.depositar(100);
		conta.sacar(500);
		conta.VerificarSaldo();
		
		sc.close();

	}

}
