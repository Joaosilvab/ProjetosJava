import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			genero[i] = sc.next().charAt(0);
		}
		
		double maiorA = altura[0];
		double menorA = altura[0];
		
		for(int i = 1; i < n; i++) {
			if(altura[i] > maiorA) {
				maiorA = altura[i];
			}
		}
		
		for(int i = 1; i < n; i++) {
			if(altura[i] < menorA) {
				menorA = altura[i];
			}
		}
		
		int totH = 0;
		int totM = 0;
		double somaAF =  0.0;
		for(int i = 0; i < n; i++) {
			if(genero[i] == 'F') {
				somaAF += altura[i];
				totM++;
			}
			else {
				totH++;
			}
		}
		double mediaM = somaAF / totM;
		
		
		System.out.printf("Menor altura = %.2f%n", menorA);
		System.out.printf("Maior altura = %.2f%n", maiorA);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaM);
		System.out.print("Numeros de homens = " + totH);
		
		
		
		sc.close();

	}

}
