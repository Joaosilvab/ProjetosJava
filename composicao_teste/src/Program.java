import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Motor motor = new Motor(300, "V8");
		
		Carro carro = new Carro("Toyota", "Supra", motor);
		
		System.out.println(carro); 
		
		sc.close();

	}

}
