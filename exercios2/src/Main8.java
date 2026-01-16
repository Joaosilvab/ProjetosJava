import java.util.Locale;
import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double imposto = 0.0;
		double sal = sc.nextDouble();
		
		if(sal >= 0.00 && sal <= 2000.00) {
			
			System.out.println("ISENTO");
		}
		else if(sal >= 2000.01 && sal <= 3002.00 ) {
			imposto = (sal * 8 ) / 100;
		}
		else if(sal >=  3000.01 && sal <= 4500.00) {
			imposto = (sal * 18 ) / 100;
		}
		else {
			imposto = (sal * 28) / 100;
		}
		
		System.out.printf("R$ %.2f", imposto);
		
		
		
		sc.close();

	}

}
