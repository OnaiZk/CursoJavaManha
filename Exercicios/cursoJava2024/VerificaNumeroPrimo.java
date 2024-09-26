package cursoJava2024;
import java.util.Scanner;

public class VerificaNumeroPrimo {
    public static void main(String[] args) {
        // Cria um scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número é primo
        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }

    // Função que verifica se o número é primo
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        // Verifica se o número tem algum divisor além de 1 e ele mesmo
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se o número for divisível por i, não é primo
            }
        }
        return true; // Se nenhum divisor for encontrado, o número é primo
    }
}
