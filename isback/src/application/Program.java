package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int maior = 0;
		
		System.out.print("Digite quantos numeroas tera o array: ");
		int n = sc.nextInt();
		
		
		int[] vect = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite o %d numero: ", i+1);
			vect[i] = sc.nextInt();
			if(vect[i] > maior) {
				maior = vect[i];
			}
		}
		
		System.out.println("O mair numero do array é: " + maior);
		
		sc.close();

	}

}
