package cursoJava2024;
import java.util.Scanner;

public class CalculoIAC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a circunferência dos quadris (em cm): ");
        double quadris = scanner.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        double iac = (quadris / (altura * Math.sqrt(altura))) - 18;
        System.out.printf("Seu IAC é: %.2f%n", iac);

        scanner.close();
    }
}
