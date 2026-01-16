import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int  q, cubo;
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			
			q = (int) Math.pow(i, 2);
			cubo = (int) Math.pow(i, 3);
			
			
			System.out.print(i + " ");
			System.out.print( q + " ");
			System.out.println( cubo);
			
		}
		
		
		
		
		sc.close();

	}

}
