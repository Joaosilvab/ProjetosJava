import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas Pessoas serao digitadas:");
		int n = sc.nextInt();
		
		Pessoas[] vect  = new Pessoas[n];
		
		double tot = 0.0;
		double somaA = 0.0;
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da Pessoa:%n", i + 1 );
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Pessoas(name, idade, altura);
			
			somaA += vect[i].getAltura(); 
			if(vect[i].getIdade() < 16) {
				tot += 1;
			}
		}
		
		System.out.println(tot);
		double media = (double) (tot / n ) * 100;
		System.out.println(media);
		double mediaA = somaA / n;
		
		System.out.println();
		
		System.out.printf("Altura Média: %.2f%n",mediaA);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%n", media);
		
		for(int i = 0; i < n; i++) {
			if(vect[i].getIdade() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		sc.close();

	}

}
