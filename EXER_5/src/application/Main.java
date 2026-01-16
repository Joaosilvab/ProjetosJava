package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o raio do circulo:");
		double raio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		 
		System.out.printf("a area do raio do circulo é: %.2f%n", area);
		
		sc.close();

	}

}
