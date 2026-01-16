import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		double maior = 0.0;
		int Posicao = 0;
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			
			if(vect[i] > maior) {
				maior = vect[i];
				Posicao = i;
				
			}
			
		}
		System.out.printf("Maior Valor = %.1f%n", maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + Posicao);
		
		
		
		
		
		
		
		sc.close();

	}

}
