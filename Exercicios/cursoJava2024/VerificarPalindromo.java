package cursoJava2024;

import java.util.Scanner;

public class VerificarPalindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase: ");
        String palavra = scanner.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase(); // Remove espaços e pontuações, e converte para minúsculas
        boolean ehPalindromo = verificarPalindromo(palavra);
        if (ehPalindromo) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
        scanner.close(); // Fecha o Scanner
    }

    public static boolean verificarPalindromo(String palavra) {
        String palavraInvertida = inverterPalavra(palavra);
        return palavra.equals(palavraInvertida); // Comparação insensível a maiúsculas/minúsculas
    }

    public static String inverterPalavra(String palavra) {
        String palavraInvertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }
        return palavraInvertida;
    }
}
