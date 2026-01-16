package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int maior = 0;
		int[] vect = new int[10];
		
		for(int i = 0; i <= 94; i++) {
			System.out.print("Digite o " + i + " numero:"); 
			vect[i] = sc.nextInt();
			
			if(vect[i] > maior) {
				maior = vect[i];
			}
		}
		
		System.out.println("O maior numero do array é: " + maior);

		sc.close();
	}

}
