import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, i, nI, soma = 0;

		n = sc.nextInt();

		for (i = 0; i < n; i++) {

			nI = sc.nextInt();
			soma += nI;

		}

		System.out.println(soma);

		sc.close();

	}

}
