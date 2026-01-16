import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n , x; 
		int in = 0;
		int out = 0;
		
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			x = sc.nextInt();
			if(x >= 10 && x <=20) {
				in++;
			}
			else {
				out++;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
