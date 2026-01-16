import java.util.Locale;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1 , cod2 , Npc1 , Npc2;
		double Vupc1 , Vupc2, total;
		
		cod1 = sc.nextInt();
		Npc1 = sc.nextInt();
		Vupc1 =  sc.nextDouble();
		cod2 = sc.nextInt();
		Npc2 = sc.nextInt();
		Vupc2 =  sc.nextDouble();
		
		total = (double) (Npc1 * Vupc1) + (Npc2 * Vupc2);
		
		System.out.printf("Valor a Pagar : R$ %.2f", total);
		
		sc.close();
	}

}
