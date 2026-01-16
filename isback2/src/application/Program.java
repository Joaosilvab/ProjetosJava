package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o numero que deseja saber a sequencia de Fibonacci: ");
		int n = sc.nextInt();
		
		int n3, n1 = 0;
		int n2 = 1;
		
		for(int i = 0; i<=n; i++) {
			
		 n3 = n1 + n2;
			
			
			
			
			
			System.out.println(n3);
			
			
			n1 = n2;
			n2= n3;
			
			
		}
		
		
		
		sc.close();
		
		
		
	}

}
