package application;

import java.util.Locale;
import java.util.Scanner;

import entities.FichaQuarto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		FichaQuarto[] rooms = new FichaQuarto[10]; 
		 
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
	
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d:%n", i + 1);
			System.out.printf("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			rooms[quarto] = new FichaQuarto(name, email); 
			System.out.println();
			System.out.println();
		} 
		 
		System.out.println("Busy rooms: ");
		
		
		for(int i = 0; i < rooms.length; i++) { 
			if(rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
		}
		
		
		
		
		sc.close();

	}

}
