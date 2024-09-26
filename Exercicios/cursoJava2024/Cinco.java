package cursoJava2024;

import java.util.Scanner;

public class Cinco {
	public static void main(String[] args) {
		System.out.println("Digite seu numero:");
		Scanner scanner = new Scanner(System.in);
		int numero1 = scanner.nextInt(); // exemplo de número 1
		int numero2 = scanner.nextInt(); // exemplo de número 2
		int maior = Math.max(numero1, numero2);
		System.out.println("O número maior é: " + maior);
	}

}
