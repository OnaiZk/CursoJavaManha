package cursoJava2024;

import java.util.Scanner;

public class Meses {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insira o mês:");
        String mes = scanner.next();

        switch (mes) {
            case "Janeiro":
            case "Março":
            case "Maio":
            case "Julho":
            case "Agosto":
            case "Outubro":
            case "Dezembro":
                System.out.println("O mês escolhido tem 31 dias");
                break;
            case "Fevereiro":
                System.out.println("O mês escolhido tem 28 dias");
                break;
            case "Abril":
            case "Junho":
            case "Setembro":
            case "Novembro":
                System.out.println("O mês escolhido tem 30 dias");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }
    }
}