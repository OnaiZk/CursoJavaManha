package cursoJava2024;

public class CriarMotos {
	public static void main(String[] args) {

	Moto moto1 = new Moto("Honda", "CG160", 1976, false);
	Moto moto2 = new Moto("Triumph", "Speed 400", 2024, false);
	Moto moto3 = new Moto("Triumph", "Tiger 1200", 2022, true );
		System.out.println("\n Detalhes da moto 1");
		moto1.exibirDetalhes();
		
		
		System.out.println("\n Detalhes da moto 2");
		moto2.exibirDetalhes();
		
		
		System.out.println("\n Detalhes da moto 3");
		moto3.exibirDetalhes();
	}

}
