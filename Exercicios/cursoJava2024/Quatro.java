package cursoJava2024;

import java.util.Scanner;

public class Quatro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite seu valor:");
		 {
			 int valor = scanner.nextInt();; // exemplo de número
		        if (valor % 3 == 0 && valor % 5 == 0) {
		            System.out.println("O número é divisível por 3 e 5!");
		        } else {
		            System.out.println("O número não é divisível por 3 e 5!");
		        }
		    }
		}
	}

