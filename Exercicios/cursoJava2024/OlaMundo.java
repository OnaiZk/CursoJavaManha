package cursoJava2024;

import java.util.Scanner;

public class OlaMundo {
public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	System.out.println("Qual é o seu nome?");
	String nome = scanner.nextLine();
	System.out.println("Seu Nome é " +nome+ ", de oi para o mundo!");
	
}
}
