package cursoJava2024;

import java.util.Scanner;

public class PositivosNegativos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Qual valor voce deseja enviar?");
		int valor = scanner.nextInt();

		// Criar as validações:
		if (valor < 0) {
			System.out.println("Valor Negativo");
		} else if (valor > 0) {
			System.out.println("Valor é Positivo");
		} else {
			System.out.println("O valor é Zero!");	
			}

	}

}