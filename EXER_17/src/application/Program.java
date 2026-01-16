package application;
import entities.Circulo;

public class Program {
	public static void main(String[] args) {
		
        Circulo c1 = new Circulo(5); 

        System.out.println("Raio: " + c1.getRaio());
        System.out.println("Área: " + c1.calcularArea());
        System.out.println("Circunferência: " + c1.calcularCircunferencia());
    }
}

