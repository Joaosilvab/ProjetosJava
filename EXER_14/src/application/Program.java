package application;

import java.util.HashSet;

public class Program {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 2, 3, 4, 4, 5};

        HashSet<Integer> conjunto = new HashSet<>();

        System.out.println("Elementos sem repetição:");
        for (int n : numeros) {
            if (conjunto.add(n)) { 
                System.out.print(n + " ");
            }
        }
    }
}

