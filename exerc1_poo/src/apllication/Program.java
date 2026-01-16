package apllication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		
		System.out.println("digite a altura do retangulo: ");
		rectangle.heigth = sc.nextDouble();
		
		System.out.println("digite a largura do retangulo: ");
		rectangle.width = sc.nextDouble();
		
		System.out.println(rectangle);
		
		sc.close();
	}

}
