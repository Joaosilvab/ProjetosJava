package application;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int inicio = 0;
        int fim = numeros.length - 1;

        while (inicio < fim) {
            int temp = numeros[inicio];
            numeros[inicio] = numeros[fim];
            numeros[fim] = temp;
            inicio++;
            fim--;
        }

        System.out.println("Array invertido: " + Arrays.toString(numeros));
    }
}

