package cursoJava2024;

import java.util.Scanner;

public class Verificarmaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quais sao seus numeros?:");
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();
		int numero3 = scanner.nextInt();
		int max = Math.max(numero1, Math.max(numero2, numero3));
		System.out.println("O número maior é: " + max);

	}

}
