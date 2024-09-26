package cursoJava2024;

import java.util.Scanner;

public class Somass {
public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	System.out.println("Quais sao os numeros que voce quer saber a soma?:");
	int numero = scanner.nextInt();
	int numero2 = scanner.nextInt();
	int soma = numero + numero2;
	System.out.println("Seus numero é " +soma);



}
}