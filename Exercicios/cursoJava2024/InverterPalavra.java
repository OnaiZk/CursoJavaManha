package cursoJava2024;
import java.util.Scanner;

public class InverterPalavra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.next();
        String palavraInvertida = inverterPalavra(palavra);
        System.out.println("A palavra invertida é: " + palavraInvertida);
    }

    public static String inverterPalavra(String palavra) {
        String palavraInvertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }
        return palavraInvertida;
    }
}