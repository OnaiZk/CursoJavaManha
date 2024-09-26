package cursoJava2024;

import java.util.Scanner;

public class Somanumerodois {
	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	System.out.println("Digite o valor de N:");
	int N = scanner.nextInt();
	//Variavel para armazeanar a soma
	int soma = 0;
	//Calcula a soma de todos os numeros até N
	for (int i = 1; i <= N; i++) {
		soma += i;
	}
	System.out.println("A soma de todos os numeros de 1 até " + N + " é " + soma);
	
	
	
	}
	
}