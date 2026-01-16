import java.util.Locale;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numero , horasT;
		double valorHr, sal;
		
		numero = sc.nextInt();
		horasT = sc.nextInt();
		valorHr = sc.nextDouble();
		
		sal = (double) horasT * valorHr;
		
		System.out.println("Number = " + numero);
		System.out.printf("Salary = U$ %.2f", sal);
		
		sc.close();

	}

}
