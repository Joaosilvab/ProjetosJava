package application;

import java.util.Scanner;

import entities.Endereco;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Endereco endereco = new Endereco("Kassim Mohamed", 751, "Cuiaba-MT");
		
		Pessoa pessoa = new Pessoa("João Batista", 21, endereco);
		
		pessoa.mostrardados();
		
		
		
		sc.close();

	}

}
