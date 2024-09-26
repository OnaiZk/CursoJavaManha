package cursoJava2024;
import java.util.Scanner;

public class CalculadoraDeTaksi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de quilômetros rodados: ");
        //Variavel
        double km = scanner.nextDouble();
        double valor = km*2+10;
        System.out.printf("O valor a ser pago é: R$ %.2f%n", valor);
    }

    public static double calcularValorAPagar(double kmRodados) {
        double valorAPagar = kmRodados * 2 + 10; 
        return valorAPagar;
    }
}