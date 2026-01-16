import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas Pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] idade = new int[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:%n", i + 1);
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		int maiorI = idade[0];
		String pessoaMV = name[0];
		for(int i = 1; i < n; i++) {
			if(idade[i] > maiorI) {
				maiorI = idade[i];
				pessoaMV = name[i];
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + pessoaMV);
		
		
		
		sc.close();

	}

}
