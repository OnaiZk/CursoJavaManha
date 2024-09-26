package cursoJava2024;

import java.util.Scanner;

public class JurusSiimples {

	public static void main(String[] args) {
		// Instanciando a classe (usando a classe)
		Scanner scanner = new Scanner(System.in);

		// Entrada de valores:
		System.out.println("  ---------------------------------------");
		System.out.println("-- Calculadora de Juros Simples by onaizk ---");
		System.out.println("  ---------------------------------------");
		System.out.println("Digite o capital: ");
		double capital = scanner.nextDouble();
		System.out.println("Digite a taxa de juros (%) : ");
		double taxa = scanner.nextDouble();
		System.out.println("Informe o tempo (em anos) ");
		int tempo = scanner.nextInt();

		// Calculando os Juros:
		double juros = (capital * taxa * tempo) / 100;
		System.out.println("Resultado: " + juros);

		// Resultado:
		double valor = capital + juros;
		System.out.println("O valor total investido + juros é: " + valor);

		scanner.close();

	}

}
