package cursoJava2024;

public class CriarVeiculo {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Volkisvagein", "Nivus", 2000, 4);
		Carro carro2 = new Carro("Nissan", "NissanGTR r35", 2004, 4);
		Carro carro3 = new Carro("Nissan", "NissanGTR R34", 1998, 4);
		
		

		System.out.println("Detalhes do carro 1\n");
		carro1.exibirDetalhes();

		System.out.println("Detalhes do carro 2\n");
		carro2.exibirDetalhes();
                                         
		System.out.println("Detalhes do carro 3\n");
		carro3.exibirDetalhes();

	}

}
