package cursoJava2024;

//Exercicio pçara revomer duplicatas(distint)
//Apaga valores repetidos em uma lista de inteiros
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatas {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(2, 4, 6, 8, 10, 6, 7, 8, 9, 1, 2, 3);
		// removendo duplicatas
		numeros.stream().distinct().forEach(System.out::println);
		//Numeros pares
		System.out.println("\nNumeros patres:");
		numeros.stream().distinct().filter(n -> n % 2 == 0).forEach(System.out::println);
	//Numeros primos
		System.out.println("\nNúmeros primos:");
        numeros.stream()
               .distinct()
               .filter(RemoveDuplicatas::isPrimo) // Usando o método isPrimo para filtrar
               .forEach(System.out::println);
	}
		//Metodo para identificar numero primo:
	private static boolean isPrimo(int num) {
		if (num <= 1)
			return false; // Numeros menores ou iguais a 1 nao sao primos
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false; // Se o numero é divisivel por i, nao é primo
		}
		return true; // o numero é primo
	}
}
