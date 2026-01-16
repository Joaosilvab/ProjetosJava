package application;

import java.util.Scanner;

import util.calculadora;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem Vindo a Calculadora: ");
		System.out.println("Digite qual o opereçao dejesa realizar:");
		System.err.println("1- Soma");
		System.err.println("2- Subtraçao");
		System.out.println("3- Multiplcaçao");
		System.out.println("4- Divisao");
		int n = sc.nextInt();
		System.out.println("Agora digite os numeros que para fazer a operaçao : ");
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat(); 
		
		float res = calculadora.calc(n, n1, n2);
		
		System.out.println("O resultado é = " + res);
		
		sc.close();

	}

}
