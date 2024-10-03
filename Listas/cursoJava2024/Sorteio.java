package cursoJava2024;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Lista para guardar nomes digitados
		ArrayList<String> nomes = new ArrayList<>();
		String nome; // Variavel para guardar cada nome digitado:
		System.out.println("Digite os nomes das pessoas [ou 'sair' para encerrar]");
		while (true) {
			System.out.println("Digite um nome: ");
			nome = scanner.nextLine();
			if (nome.equalsIgnoreCase("sair")) {
				break;
			}
			if (!nome.trim().isEmpty()) {
				nomes.add(nome);
			} else {
				System.out.println("Nome invalido, tente novamente!");

			}

		}
		//Verifica se existem nomes na lista:
		if ( nomes.isEmpty()) {
			System.out.println("Nenhum nome foi inserido!");
		}else {
			//Sorteio:
			Random random = new Random();
			int indiseSorteado = random.nextInt(nomes.size());
			String nomesSorteado = nomes.get(indiseSorteado);
			//Exibe o nome sorteado:
System.out.println("A pessoa sorteada foi: " +nomesSorteado );
		}
	scanner.close();	
		
		
		
		
		
		
		
		
	}
}