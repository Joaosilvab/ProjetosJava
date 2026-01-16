import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod ,totAlcool = 0 , totGaso = 0 , totDiesel = 0;
		
		cod = sc.nextInt();
		
		while(cod != 4) {
			
			while(cod <1 || cod >4) {
				System.out.println("Código Invalido digite novamente");
				cod = sc.nextInt();
			}
			if(cod == 1) {
				totAlcool += 1;
			}
			else if(cod == 2) {
				totGaso += 1;
			}
			else if(cod == 3) {
				totDiesel += 1;
			}
			
			System.out.println("Digite o tipo de combustivel abastecido");
			cod = sc.nextInt();
			
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool : " + totAlcool);
		System.out.println("Gasolina : " + totGaso);
		System.out.println("Diesel : " + totDiesel);
		
		sc.close();
	}

}
