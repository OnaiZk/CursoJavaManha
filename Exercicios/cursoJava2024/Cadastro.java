package cursoJava2024;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual é o seu nome?");
		String nome = scanner.nextLine();

		System.out.println("Qual é a sua idade:");
		int idade = scanner.nextInt();
		scanner.nextLine(); // Consumir a quebra de linha

		if (idade < 18) {
			System.out.println(
					"Você não pode concluir esse cadastro por ser menor de idade, por favor tente novamente mais tarde!");
			scanner.close();
			return;
		}

		System.out.println("Cadastro concluído! O que o senhor(a) deseja?");
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1. Transferir");
		System.out.println("2. Depositar");
		System.out.println("3. Sair");

		int escolha = scanner.nextInt();
		scanner.nextLine(); // Consumir a quebra de linha

		switch (escolha) {
		case 1:
			transferir(scanner);
			break;
		case 2:
			depositar(scanner);
			break;
		case 3:
			System.out.println("Você escolheu Sair.");
			break;
		default:
			System.out.println("Opção inválida");
		}

		scanner.close();
	}

	private static void transferir(Scanner scanner) {
		System.out.println("Você escolheu Transferir");
		System.out.println("Qual o valor que você deseja Transferir?");
		double valor = scanner.nextDouble();
		scanner.nextLine(); // Consumir a quebra de linha

		System.out.println("Número de telefone:");
		String numeroTelefone = scanner.nextLine();

		System.out.println("Transferência realizada.");
	}

	private static void depositar(Scanner scanner) {
		System.out.println("Você escolheu Depositar");
		System.out.println("Qual o valor que você deseja Depositar?");
		double valor = scanner.nextDouble();
		scanner.nextLine(); // Consumir a quebra de linha

		System.out.println("O valor já foi depositado");
		System.out.println("Depósito realizado.");
	}
}