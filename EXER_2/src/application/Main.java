package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		  
		System.out.print("digite o primeiro numero: ");
		int n1 = sc.nextInt();
		System.out.print("digite o segundo numero: ");
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		
		System.out.print("A soma dos dois numeros inteiros é: " + soma);	
		
		
		
		
		
		
		
		sc.close();

	}

}
