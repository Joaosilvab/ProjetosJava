import java.util.Locale;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codItem , QtItem;
		double total = 0;
		
		codItem = sc.nextInt();
		QtItem = sc.nextInt();
		
		if ( codItem == 1) {
			
			total = (double) QtItem * 4.00;
			
		}
		else if ( codItem == 2 ) {
			
			total = (double) QtItem * 4.50; 
			
		}
		else if ( codItem == 3 ) {
			
			total = (double) QtItem * 5.00; 
			
		}
		else if ( codItem == 4 ) {
			
			total = (double) QtItem * 2.00; 
			
		}
		else if ( codItem == 5 ) {
			
			total = (double) QtItem * 1.50;
			
		}

		
		System.out.printf("Total : R$ %.2f%n", total);
		
		sc.close();

	}

}
