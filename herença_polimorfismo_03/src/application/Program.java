package application;

import java.util.ArrayList;
import java.util.List;

import entities.Usuario;
import entities.UsuarioAdministrador;
import entities.UsuarioGratuito;
import entities.UsuarioPremium;

public class Program {

	public static void main(String[] args) {
		
		List<Usuario> list = new ArrayList<>();
		 
		list.add(new UsuarioGratuito("Ana"));
		list.add(new UsuarioPremium("Bruno")) ;
		list.add(new UsuarioAdministrador("Carla"));
		
		
		for(Usuario u : list) {
		   System.out.println(u.receberNotificacao("Atualização disponível!"));
		}
	}

}
