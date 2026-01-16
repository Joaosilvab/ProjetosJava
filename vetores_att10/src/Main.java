import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] n1 = new double[n];
		double[] n2 = new double[n];
		
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", i + 1);
			nome[i] = sc.nextLine();
			n1[i] = sc.nextDouble();
			n2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		for(int i = 0; i < n; i++) {
			
			if((n1[i] + n2[i]) / 2 >= 6.0) {
				System.out.println(nome[i]);
			}
			
		}
		
		
		
		
		sc.close();

	}

}
