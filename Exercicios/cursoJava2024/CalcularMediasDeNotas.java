package cursoJava2024;

import java.util.Scanner;

public class CalcularMediasDeNotas {
public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	System.out.println("Qual é sua nota 1?");
	int nota1 = scanner.nextInt();
	System.out.println("Qual é sua nota 2?");
	int nota2 = scanner.nextInt();
	System.out.println("Qual é sua nota 3?");
	int nota3 = scanner.nextInt();
	System.out.println("Qual é sua nota 4?");
	int nota4 = scanner.nextInt();
	double media = (nota1 + nota2 + nota3 + nota4) /4;
	System.out.println("A media entre suas notas sao: " +media);
	
}
}
