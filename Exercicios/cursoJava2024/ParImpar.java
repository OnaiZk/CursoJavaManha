package cursoJava2024;

import java.util.Scanner;

public class ParImpar {
public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	System.out.println("qual é o seu numero?");
	int numero = scanner.nextInt();
	String resultado = (numero % 2 == 0) ? "par" : "impar";
	System.out.println("Seu numero "+numero+ " é " +resultado);
}
}
