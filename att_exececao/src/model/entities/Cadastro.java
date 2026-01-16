package model.entities;

import model.exceptions.IdadeInvalidaException;

public class Cadastro {

	String name ;
	int idade;
	
	public Cadastro(String name, int idade) throws IdadeInvalidaException  {
		if(idade < 0 || idade > 120) {
			throw new IdadeInvalidaException("A idade deve ser entre 0 a 120 anos");
		}
		this.name = name;
		this.idade = idade; 
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	@Override
	public String toString() {
		return name 
			   + "\n"
			   +idade;
	}
	
	
	 
}
