package util;

public class calculadora {

	
	public static float calc(int n, float n1 , float n2 ) {
		
		if(n == 1) {
			return n1 + n2;  
		}
		else if(n == 2) {
			return n1 - n2; 
		}
		else if(n == 3) {
			return n1 * n2;
		}
		else if(n == 4) {
			return n1 / n2; 
		}
		return 0; 
	}
	 
	
	
	
	
	
}
