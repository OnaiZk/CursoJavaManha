package cursoJava2024;

public class IfConciso {

	public static void main(String[] args) {
		// Declarando variavel
		int numero = 9;

		// Uso do if normal
		/*
		 * if (numero > 10) { System.out.println("Valor maior/igual que 10"); }else if
		 * (numero == 10) { System.out.println("Valor é igual a 10"); }else {
		 * System.out.println("Valor menor que 10"); }
		 */

		// Uso do if ternario

		String resultado = (numero >= 10) ? "Maior que 10" : "Menor que 10";
		System.out.println("O número " + numero + " é " + resultado);
	}
}