package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employe;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employe> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Emplyoee #%d:%n", i + 1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary");
			double salary = sc.nextDouble();
			Employe emp = new Employe(id, name, salary);
			
			list.add(emp); 
		}
		
		//Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		//if(emp == null) {
		//	System.out.println("This id does not exist!");
		//}
		//else {
		//	System.out.print("Enter the percentage: ");
		//	double porc = sc.nextDouble();
		//	emp.aumento(porc);
		//}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int idU =  sc.nextInt();
		
		Integer posid = posicao(list, idU);
		
		if(posid == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double porc = sc.nextDouble();
			list.get(posid).aumento(porc);
		}
		
		System.out.println("List of Employees:");
		
		for(Employe x : list) {
			System.out.println(x);
		}
		
		sc.close();
	}
	
	
	public static Integer posicao(List<Employe> list, int id) { 
		
		 for(int i = 0; i < list.size(); i++) {
			 if(list.get(i).getId() == id) {
				 return i;  
			 }
		 }
		 return null; 
	}

}
