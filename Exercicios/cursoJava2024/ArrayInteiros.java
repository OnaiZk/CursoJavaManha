package cursoJava2024;

import java.util.Scanner;

public class ArrayInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número para a posição " + i + ": ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Valores inseridos no array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor na posição " + i + ": " + numeros[i]);
        }
        sc.close();
    }
}
