package cursoJava2024;

import java.util.Scanner;

public class IfTernariodois {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu numero:");
		int valor = scanner.nextInt();
		String resultado = (valor >= 18) ? "maior de idade" : "menor de idade";
		System.out.println("Voce é " + resultado);

	}
}
