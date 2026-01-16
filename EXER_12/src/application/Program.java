package application;

public class Program {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5}; 

        boolean ordenado = true;
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                ordenado = false;
                break;
            }
        }

        if (ordenado) {
            System.out.println("O array está ordenado em ordem crescente.");
        } else {
            System.out.println("O array NÃO está ordenado em ordem crescente.");
        }
    }
}
