package cursoJava2024;

public class TrabalhandocomStrings {

    public static void main(String[] args) {
        String texto = "Bem-vindo ao curso de Java.";
        String texto2 = "Vamos aprender sobre STRING";

        // Obter o comprimento da string
        String nome = "Cassiano Moura Silva";
        System.out.println("Comprimento da string: " + nome.length());

        // Concatenar strings
        String textoCompleto = texto + " " + texto;
        System.out.println("Texto Completo: " + textoCompleto);

        // Converter para maiúsculas e minúsculas
        System.out.println("MAIÚSCULAS: " + texto.toUpperCase());
        System.out.println("minúsculas: " + texto.toLowerCase());

        // Substituir uma parte da string
        String novoTexto = texto.replace("Java", "Vitória");
        System.out.println(novoTexto);

        // Buscar por uma substring
        int posicao = texto.indexOf("curso");
        System.out.println("Posição da palavra 'curso': " + posicao);

        // Verificar se uma string começa ou termina com uma substring
        System.out.println("Começa com 'Bem': " + texto.startsWith("Bem"));
        System.out.println("Termina com 'Java': " + texto.endsWith("Java"));

        // Dividir string
        String[] palavras = textoCompleto.split(" ");
        if (palavras != null && palavras.length > 0) {
            System.out.println("Palavras no texto completo: ");
            for (String palavra : palavras) {
                System.out.println(palavra);

                // Remover espaços
                String textoComEspaços = "   texto com espaços    ";
                if (textoComEspaços != null) {
                    System.out.println("Texto sem espaços: " + textoComEspaços.trim());
                }
            }
        }
    }
}