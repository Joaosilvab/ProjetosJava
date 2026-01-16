import java.util.Locale;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		

		for (int i = 0; i < n; i++) {
			double mediaP = 0.0;
			
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			
			mediaP = (n1 * 2) + (n2 * 3) + (n3 * 5);
			mediaP = mediaP / 10;
			System.out.printf("%.1f%n", mediaP);

		}

		sc.close();

	}

}
