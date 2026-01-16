package application;

import model.entities.Cadastro;
import model.exceptions.IdadeInvalidaException;

public class Program {

	public static void main(String[] args) {
		
		
		try {
		Cadastro cadastro = new Cadastro("Joao", 120);
		System.out.println(cadastro);
		}
		catch(IdadeInvalidaException e) { 
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Processo Encerrado");
		}
		
	}
}
