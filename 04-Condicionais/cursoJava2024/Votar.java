package cursoJava2024;

import java.util.Scanner;

public class Votar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("Maior de 18 anos e obrigatorio votar!");
        } else {
            System.out.println("Entre de 16 ate 18 anos voce vota se quiser!");
        }
    }
}