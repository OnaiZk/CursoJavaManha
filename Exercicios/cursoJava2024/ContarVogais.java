package cursoJava2024;
import java.util.Scanner;

public class ContarVogais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        int quantidadeVogais = contarVogais(frase);
        System.out.println("A frase contém " + quantidadeVogais + " vogais.");
    }

    public static int contarVogais(String frase) {
        int quantidadeVogais = 0;
        for (char c : frase.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                quantidadeVogais++;
            }
        }
        return quantidadeVogais;
    }
}