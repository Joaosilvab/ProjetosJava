package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;



public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Banco banco;
		
		System.out.println("Enter account number: ");
		int nconta = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.println("Is there na initial deposit (y/n)?");
		char r = sc.next().charAt(0);
		
		double depo;
		
		if (r == 'y') {
			System.out.println("Enter inital deposit value: ");
			 depo = sc.nextDouble();
			 banco = new Banco(nconta, name, depo);
		}
		else {
		     banco = new Banco(nconta, name);
		}
		
		 
		
		System.out.println(banco); 
		System.out.println();
		
		System.out.println("Enter a deposit value: ");
		depo = sc.nextDouble();
		banco.depostio(depo);
		System.out.println("Upadate account data:");
		System.out.println(banco);
		
		System.out.println();
		
		System.out.println("Enter a withdraw value: ");
		double saq = sc.nextDouble();
		banco.saque(saq);
		System.out.println("Upadate account data:");
		System.out.println(banco);
		
		
		sc.close();

	}

}
