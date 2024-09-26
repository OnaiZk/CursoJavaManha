package cursoJava2024;

import java.util.Scanner;

public class Dirigir {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// Pedir a idade edo usuario:
			System.out.println("Qual a sua idade?");
			int idade = scanner.nextInt();
			if (idade >= 18) {
				System.out.println("com essa idade ja pode dirigir, se tiver carteira de motorista");
			} else if (idade < 18) {
				System.out.println("com menos de 18, o senhor nao pode dirigir");

			}
		}
	}
}
