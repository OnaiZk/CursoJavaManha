package cursoJava2024;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("A tabuada de qual numero o(a) senhor(a) quer saber?");
		int numero1 = scanner.nextInt();
		System.out.println("agora fale onde devo parar: ");
		int numero2 = scanner.nextInt();
		int cont = 1;
		while (cont <= numero2) {
			int res = numero1 * cont;
			System.out.println(numero1 + " x " + cont + " = " + res);
			cont++;
		}
	}
}