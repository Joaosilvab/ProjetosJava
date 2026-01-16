package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is the dollar price?");
		double dolar = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double valor = sc.nextDouble();
		
		double R = CurrencyConverter.calc(dolar, valor);
		
		System.out.printf("Amount to be paid in reias = %.2f%n", R);
		
		 
		
		sc.close();

	}

}
