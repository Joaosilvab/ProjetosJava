package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero para saber se ele é par ou impar:");
		
		int N1 = sc.nextInt();
		
		if(N1 % 2 ==0) {
			System.out.println("O numero é Par");
		}
		else{
			System.out.println("O numero é Ímpar");
		}

		
		
		
		
		sc.close();

	}

}
