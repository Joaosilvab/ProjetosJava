package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.n1 = sc.nextDouble();
		student.n2 = sc.nextDouble();
		student.n3 = sc.nextDouble();
		
		
		double tot = student.notaF();
		
		if(tot >= 60.0) {
			System.out.printf("FINAL GRADE = %.2f%n", tot);
			System.out.println("PASS");
		}
		else {
			double rest = 60.0 - tot;
			System.out.printf("FINAL GRADE = %.2f%n", tot);
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", rest);
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
