package application;

import java.util.Scanner;

public class MediaLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = sc.nextInt();

        double soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            double num = sc.nextDouble();
            soma += num;
        }

        double media = soma / n;

        System.out.println("A média dos números é: " + media);

        sc.close();
    }
}

