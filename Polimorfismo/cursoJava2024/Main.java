package cursoJava2024;

public class Main {

	public static void main(String[] args) {
//Criançao de uma conta bancaria com saldo inical de 1000,00:
		ContaBancaria conta = new ContaBancaria(5000.00);
//exibir o saldo inicial
		System.out.println("Saldo Inicial R$" + conta.getSaldo());

		// Realizando um deposito de R$: 500,00:
		conta.sacar(2500);
		System.out.println("Saldo R$" + conta.getSaldo());
		//Deposito
		conta.depositar(2500);
		System.out.println("Saldo R$" + conta.getSaldo());
	}
}
