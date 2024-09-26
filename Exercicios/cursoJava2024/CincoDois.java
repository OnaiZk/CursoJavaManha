package cursoJava2024;

import java.util.Scanner;

public class CincoDois {
	public static void main(String[] args) {
		System.out.println("Digite seu numero:");
		Scanner scanner = new Scanner(System.in);
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();
		int maior = Math.max(numero1, numero2);
		System.out.println("O número maior é: " + maior);
	}
}
