package cursoJava2024;

import java.util.Scanner;

public class CalculadoradeJurosCompostos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("  ---------------------------------------");
		System.out.println("-- Calculadora de Juros Compostos by onaizk ---");
		System.out.println("  ---------------------------------------");

		System.out.println("Qual é o principal (capital inicial): ");
		double P = scanner.nextDouble();
		System.out.println("Digite a taxa (%): ");
		double I = scanner.nextDouble() / 100; // Convertendo para valor decimal
		System.out.println("Digite o tempo (número de periodos): ");
		int T = scanner.nextInt();
		double valorFinal = CalcularJurosCompostos(P, I, T);

		System.out.printf("O valor final é: R$ %.2f%n", valorFinal);
	}

	public static double CalcularJurosCompostos(double valorInicial, double taxaJuros, int numPeriodos) {
		return valorInicial * Math.pow(1 + taxaJuros, numPeriodos);
	}
}