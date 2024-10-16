package cursoJava2024;

import java.util.Scanner;

public class CrudArray {
	// Arrays para armazenar nomes e idades:
	static String[] nomes = new String[10];
	static int[] idades = new int[10];
	static int contador = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\n--- MENU ONAIZK ---");
			System.out.println("1. Adicionar Usuario");
			System.out.println("2. Exibir Usuarios");
			System.out.println("3. Atualizar Usuarios");
			System.out.println("4. Deletar usuario");
			System.out.println("5. Sair");
			System.out.print("ESCOLHA UMA OPÇÃO: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				adicionarUsuario(sc);
				break;
			case 2:
				exibirUsuarios();
				break;
			case 3:
				atualizarUsuario(sc);
				break;
			case 4:
				deletarUsuario(sc);
				break;
			case 5:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
			}
		} while (opcao != 5);

		sc.close();
	}

//Criando todos os metodos:
	static void adicionarUsuario(Scanner sc) {
		if (contador < 10) {
			System.out.print("Digite o nome: ");
			nomes[contador] = sc.nextLine();
			System.out.print("Digite a idade: ");
			idades[contador] = sc.nextInt();
			sc.nextLine();
			contador++;
			System.out.println("Usuário adicionado com sucesso!");
		} else {
			System.out.println("Limite de usuários atingido!");
		}
	}

	static void exibirUsuarios() {
		if (contador == 0) {
			System.out.println("Nenhum usuário cadastrado.");
		} else {
			for (int i = 0; i < contador; i++) {
				System.out.println((i + 1) + ". Nome: " + nomes[i] + ", Idade: " + idades[i]);
			}
		}
	}

	static void atualizarUsuario(Scanner sc) {
		exibirUsuarios();
		System.out.print("Digite o número do usuário que deseja atualizar: ");
		int index = sc.nextInt() - 1;
		sc.nextLine();

		if (index >= 0 && index < contador) {
			System.out.print("Novo nome: ");
			nomes[index] = sc.nextLine();
			System.out.print("Nova idade: ");
			idades[index] = sc.nextInt();
			sc.nextLine();
			System.out.println("Usuário atualizado com sucesso!");
		} else {
			System.out.println("Usuário não encontrado!");
		}
	}

	static void deletarUsuario(Scanner sc) {
		exibirUsuarios();
		System.out.print("Digite o número do usuário que deseja deletar: ");
		int index = sc.nextInt() - 1;
		sc.nextLine();

		if (index >= 0 && index < contador) {
			for (int i = index; i < contador - 1; i++) {
				nomes[i] = nomes[i + 1];
				idades[i] = idades[i + 1];
			}
			nomes[contador - 1] = null;
			idades[contador - 1] = 0;
			contador--;
			System.out.println("Usuário deletado com sucesso!");
		} else {
			System.out.println("Usuário não encontrado!");
		}
	}
}
