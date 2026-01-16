package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase ou palavra: ");
        String texto = sc.nextLine();

        int contador = 0;

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        System.out.println("Quantidade de vogais: " + contador);

        sc.close();
    }
}


