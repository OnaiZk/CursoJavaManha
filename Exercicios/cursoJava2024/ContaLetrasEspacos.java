package cursoJava2024;

import java.util.Scanner;

public class ContaLetrasEspacos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = scanner.nextLine();
		int contadorLetras = 0;
		int contadorEspacos = 0;
		for (int i = 0; i < frase.length(); i++) {
			char caractere = frase.charAt(i);
			if (Character.isLetter(caractere)) {
				contadorLetras++;
			}
			if (Character.isWhitespace(caractere)) {
				contadorEspacos++;
			}
		}
		System.out.println("A frase contém " + contadorLetras + " letras.");
		System.out.println("A frase contém " + contadorEspacos + " espaços em branco.");
		scanner.close();
	}
}
