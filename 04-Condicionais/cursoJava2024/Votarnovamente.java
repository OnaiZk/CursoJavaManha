package cursoJava2024;

import java.util.Scanner;

public class Votarnovamente {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		//Pedir a idade do usuario:
		System.out.println("Digite sua idade seu arrombado:");
		int idade = scanner.nextInt();
				System.out.println("Voce tem "+idade+" anos!");
	
				if( idade < 16 ) {
					System.out.println("Ops... Você ainda nâo tem idade para votar!");
				} else if (idade >= 16 &&  idade < 18 || idade > 65) {
						System.out.println("Opa... Seu voto é facultativo, mas voce, exerça seu direito de voto!");
			} else {
				System.out.println("Você é obrigado a votar, evite pagar multa!");
			}
	}
}