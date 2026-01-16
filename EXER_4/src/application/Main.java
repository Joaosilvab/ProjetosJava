package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome:");
		String name = sc.nextLine();
		System.out.println("Olá, " + name + " Boa Tarde!");
			
		sc.close();
		
	}
}
