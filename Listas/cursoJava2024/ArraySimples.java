package cursoJava2024;

public class ArraySimples {

	public static void main(String[] args) {

		// criando um array de supermercado

		String[] mercado = { "Massa de Brownie", "Ovos", "Leite", "Barra de chocolate amargo", "Margarina" };

		// Exubindo apenas o terceiro item da lista:

		System.out.println("Item seleceionado: " + mercado[0]);
		// Todo Array começa com zero

		// Exibindo todos os items do Array

		
		// Como ler "i < mercado.length": Enquanto item for menor do que o comprimento de itens no array, faça algo.
		
		for (int i = 0; i < mercado.length; i++) { 
			System.out.println(mercado[i]);

			
			
			
		}

	}

}