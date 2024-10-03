import java.util.Scanner;

public class ImpostoDeRenda {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Entrada do salário bruto
		System.out.print("Digite o seu salário mensal bruto: ");
		double salarioBruto = scanner.nextDouble();

		// Cálculo do INSS
		double inss = calcularINSS(salarioBruto);
		double salarioBase = salarioBruto - inss; // Salário base para cálculo do IR

		// Cálculo do Imposto de Renda
		double imposto = calcularImpostoDeRenda(salarioBase);

		// Exibição dos resultados
		System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
		System.out.printf("Desconto INSS: R$ %.2f%n", inss);
		System.out.printf("Salário Base para IR: R$ %.2f%n", salarioBase);
		System.out.printf("Imposto de Renda devido: R$ %.2f%n", imposto);

		scanner.close();
	}

	// Método para calcular o INSS com base no salário bruto
	public static double calcularINSS(double salario) {
		double inss = 0.0;

		if (salario <= 1320.00) {
			inss = salario * 0.075;
		} else if (salario <= 2571.29) {
			inss = (1320.00 * 0.075) + ((salario - 1320.00) * 0.09);
		} else if (salario <= 3856.94) {
			inss = (1320.00 * 0.075) + ((2571.29 - 1320.00) * 0.09) + ((salario - 2571.29) * 0.12);
		} else if (salario <= 7507.49) {
			inss = (1320.00 * 0.075) + ((2571.29 - 1320.00) * 0.09) + ((3856.94 - 2571.29) * 0.12)
					+ ((salario - 3856.94) * 0.14);
		} else {
			inss = (1320.00 * 0.075) + ((2571.29 - 1320.00) * 0.09) + ((3856.94 - 2571.29) * 0.12)
					+ ((7507.49 - 3856.94) * 0.14);
		}

		return inss;
	}

	// Método para calcular o Imposto de Renda com base no salário base
	public static double calcularImpostoDeRenda(double salarioBase) {
		double imposto = 0.0;

		if (salarioBase <= 1903.98) {
			imposto = 0.0; // Isento
		} else if (salarioBase <= 2826.65) {
			imposto = (salarioBase - 1903.98) * 0.075;
		} else if (salarioBase <= 3751.05) {
			imposto = (salarioBase - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
		} else if (salarioBase <= 4664.68) {
			imposto = (salarioBase - 3751.05) * 0.225 + (3751.05 - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
		} else {
			imposto = (salarioBase - 4664.68) * 0.275 + (4664.68 - 3751.05) * 0.225 + (3751.05 - 2826.65) * 0.15
					+ (2826.65 - 1903.98) * 0.075;
		}

		return imposto;
	}
}
