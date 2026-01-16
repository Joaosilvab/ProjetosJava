package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N (quantidade de termos): ");
        int n = sc.nextInt();

        int primeiro = 0, segundo = 1;

        System.out.println("Sequência de Fibonacci com " + n + " termos:");

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiro + " ");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        sc.close();
    }
}

