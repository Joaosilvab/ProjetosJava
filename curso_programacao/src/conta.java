import java.util.Locale;
import java.util.Scanner;

public class conta {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	

		int x = sc.nextInt();
		int soma = x;

		while (x != 0) {
			x = sc.nextInt();
			soma += x;
		}
		System.out.println("a soma dos numeros digitado foi:" + soma);
		sc.close();
	}
}
