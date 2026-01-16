package application;

import java.util.Scanner;

import exceptions.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome:");
		String name = sc.nextLine();
		System.out.print("Digite sua idade:");
		int idade = sc.nextInt();
		
		 
		Pessoa pessoa = new Pessoa(name,idade);
		
		System.out.println(pessoa);
		
		
		sc.close();

	}

}
