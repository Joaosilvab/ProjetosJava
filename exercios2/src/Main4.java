import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		int horaI , horaF , hr  = 24;
		
		horaI = sc.nextInt();
		horaF = sc.nextInt();
		
		if (horaI > horaF) {
			
			hr = hr - horaI + horaF;
		}
		else if (horaF > horaI) {
			
			hr = horaF - horaI;
			
		}
		else {
			hr = 24;
		}
		
		System.out.println("O jogo durou " + hr + " HORAS(S)");
		
		sc.close();
		

	}

}
