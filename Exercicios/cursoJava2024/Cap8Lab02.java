package cursoJava2024;

import java.util.Scanner;

public class Cap8Lab02 {
	public static void main(String[] args) {
		if (args.length > 0) {
			int soma = 0;
			for (int i = 0; i < args.length; i++) {
				soma += Integer.parseInt(args[i]);
			}
			double media = (double) soma / args.length;
			System.out.println("Soma das idades: " + soma);
			System.out.println("Média das idades: " + media);
		} else {
			System.out.println("Entre com valores válidos para as idades:");
			Scanner sc = new Scanner(System.in);
			System.out.print("Quantas idades você deseja inserir? ");
			int n = sc.nextInt();
			int soma = 0;
			for (int i = 0; i < n; i++) {
				System.out.print("Insira a idade " + (i + 1) + ": ");
				soma += sc.nextInt();
			}
			double media = (double) soma / n;
			System.out.println("Soma das idades: " + soma);
			System.out.println("Média das idades: " + media);
			sc.close();
		}
	}
}