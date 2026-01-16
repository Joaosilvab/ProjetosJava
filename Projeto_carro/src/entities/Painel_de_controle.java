package entities;


import java.util.Scanner;

import entities.Carro;

public class Painel_de_controle {

	public static void main(String[] args) {
		
		Carro car = new Carro();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entra");
		
		
		car.menu = sc.nextInt();
		car.modelo = "sedan";
		car.cor = "vermelho";
		car.abrir();
		car.fechar();
		car.ligar();
		car.status();
		sc.close();
		
		
		
		
		

	}

}

