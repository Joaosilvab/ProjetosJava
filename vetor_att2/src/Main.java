import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos Numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero:");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		double media = soma / n;

		System.out.print("VALORES: ");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f  ", vect[i]);
		}
		System.out.println();

		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", media);

		sc.close();

	}

}
