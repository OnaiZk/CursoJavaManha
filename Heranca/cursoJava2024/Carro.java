package cursoJava2024;

public class Carro extends Veiculo {
	private int numerodePortas;
	public Carro(String marca, String modelo, int ano, int numerodePortas){
		super(marca, modelo, ano);
		this.numerodePortas = numerodePortas;
	}


	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Numero de Portas: " + numerodePortas);
	}
}
