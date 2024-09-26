package cursoJava2024;

import java.util.Scanner;

public class Desconto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("digite o valor da compra:");
		double valor = scanner.nextDouble();
		System.out.println("Digite o desconto (%):");
		double desconto = scanner.nextDouble();
		double valorDesconto = valor * (desconto / 100);
		double precoFinal = valor - desconto;
		System.out.printf("O preço final após %.2f%% de desconto é: R$ %.2f\n", valorDesconto, precoFinal);
		scanner.close();
	}
}
