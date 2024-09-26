package cursoJava2024;

import java.util.Scanner;

public class IfTernario {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu numero:");
		int valor = scanner.nextInt();
		String resultado = (valor % 2 == 0) ? "par" : "impar";
		System.out.println("O valor " + valor + " é " + resultado);

	}
}
