package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		
		
		List<Person> list = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for ( int i = 1; i <= n; i++) {
			
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(ch == 'i') {
				
				System.out.print("Health expenditures: ");
				double gastosComSaude = sc.nextDouble();
				list.add(new NaturalPerson(name, anualIncome, gastosComSaude));
				
			}
			else {
				System.out.print("Number of employees: ");
				int NumerodeFuncionarios = sc.nextInt();
				list.add(new LegalPerson(name, anualIncome, NumerodeFuncionarios));
			}
			
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for(Person pe : list) {
			System.out.println(pe.getName() + ": $ " + pe.imposto() );
		}
		
		double sum = 0.0;
		for( Person pe : list) {
			sum += pe.imposto();
		}
		
		System.out.println("TOTAL TAXES: $ " + sum);
		
		
		sc.close(); 
	}

}
