package cursoJava2024;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenaNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[5];
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}
		Arrays.sort(numeros);
		System.out.println("Os números em ordem crescente são:");
		for (int numero : numeros) {
			System.out.println(numero);
		}
		scanner.close();
	}
}
