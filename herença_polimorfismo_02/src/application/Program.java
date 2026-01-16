package application;

import java.util.ArrayList;
import java.util.List;

import entities.Caminhao;
import entities.Carro;
import entities.Moto;
import entities.Veiculo;

public class Program {

	public static void main(String[] args) {
		
		
		List<Veiculo> list = new ArrayList<>();
		
		
		list.add(new Carro("Onix", 2020, 800.0));
		list.add(new Moto("CG 160", 2018, 500.0));
		list.add(new Caminhao("Volvo FH", 2015, 1500.0));
		
		for(Veiculo ve : list) {
			ve.mostraDados();
		}
	}

}
