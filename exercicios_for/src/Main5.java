import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int F = 1;
		
		for (int i = n; i > 0; i--) {

			F = F * i;
		}
		
		System.out.println(F);
		sc.close();

	}

}
