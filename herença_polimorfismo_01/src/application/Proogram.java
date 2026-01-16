package application;

import java.util.ArrayList;
import java.util.List;

import entities.Desenvolverdor;
import entities.Estagiario;
import entities.Funcionario;
import entities.Gerente;




public class Proogram {
	
	public static void exibir(List<Funcionario> list) {
		
		for(Funcionario fun : list) {
			fun.mostrarDados();
		}
		
	}

	public static void main(String[] args) {
		
		List<Funcionario> list = new ArrayList<>();
		
		list.add(new Gerente("Bg", 3000.0));
		list.add(new Desenvolverdor("DG", 4000.0));
		list.add(new Estagiario("Alan", 1414.0));
		
		exibir(list);
		
		

	}

}
