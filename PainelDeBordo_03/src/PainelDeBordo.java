
import java.util.Scanner;
public class PainelDeBordo {
    public static void main(String[] args) {
    	
    	Motorista motoristaA = new Motorista("MotoristaA", null, "Centro");
        Motorista motoristaB = new Motorista("MotoristaB", null, "Centro");
        
        Carro carroA = new Carro("SUV", "Prata", "MotoristaA", "Centro", false); 
        Carro carroB = new Carro("Sedan", "Preto", "MotoristaB", "Centro", false); 
        Carro carroTrabalhoB = new Carro("Hatch", "Verde", "MotoristaB", "Centro", true);
       
      
        motoristaA = new Motorista("MotoristaA", carroA, "Centro");
        motoristaB = new Motorista("MotoristaB", carroB, "Centro");
      
      
        // Testando Regras //
        System.out.println("Motorista A pode dirigir carro A? " + SistemaDePermissao.podeDirigir(motoristaA, carroA)); // true
        System.out.println("Motorista A pode dirigir carro B? " + SistemaDePermissao.podeDirigir(motoristaA, carroB)); // true
        System.out.println("Motorista A pode dirigir carro de trabalho B? " + SistemaDePermissao.podeDirigir(motoristaA, carroTrabalhoB)); // false

        System.out.println("Motorista B pode dirigir carro A? " + SistemaDePermissao.podeDirigir(motoristaB, carroA)); // true
        System.out.println("Motorista B pode dirigir carro B? " + SistemaDePermissao.podeDirigir(motoristaB, carroB)); // true
        System.out.println("Motorista B pode dirigir carro de trabalho A? " + SistemaDePermissao.podeDirigir(motoristaB, new Carro("SUV", "Cinza", "MotoristaA", "Centro", true)));
      
      
       
      
      //Carro car = new Carro();
      //Scanner entrada = new Scanner(System.in);
      //System.out.println("Entre com a Opcao" +
              //" do Menu 1 - Entrar | 0 - Sair: ");
      //car.menu = entrada.nextInt();
      //car.modelo = "sedan"; 
      //car.cor = "Vermelho"; 
      //car.abrir();
      //car.fechar();
      //car.ligar();
      //car.status();
      
      
      //entrada.close();
    }
}