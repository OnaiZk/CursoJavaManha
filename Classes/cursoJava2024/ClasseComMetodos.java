package cursoJava2024;

public class ClasseComMetodos {
	
    // Metodo 01: Calcula a soma de 3 numeros:
    public int soma(int a, int b, int c) {
        return a + b + c;
    }

    // Metodo 02: Verificar se um numero é par:
    public boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    // Método 03: Inverte uma string:
    public static String inverterPalavra(String palavra) {
        String palavraInvertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }
        return palavraInvertida;
    }

    public static void main(String[] args) {
        // Instanciando a classe:
        ClasseComMetodos utilidades = new ClasseComMetodos();
        
        // Chamando os metodos:
        System.out.println("A soma de 5, 3 e 8 é: " + utilidades.soma(5, 3, 8));
        System.out.println("O numero 6 é par?: " + utilidades.ehPar(6));
        System.out.println("A palavra invertida de 'cassiano' é: " + inverterPalavra("cassiano"));
    }
}
