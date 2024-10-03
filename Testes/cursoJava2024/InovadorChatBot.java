package cursoJava2024;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class InovadorChatBot {

    // Um mapa para armazenar perguntas e respostas
    private Map<String, String> conhecimento = new HashMap<>();

    public InovadorChatBot() {
        // Conhecimento inicial do chatbot
        conhecimento.put("Olá", "Oi! Como posso te ajudar?");
        conhecimento.put("Qual é o seu nome?", "Eu sou um chatbot inovador, treinado para aprender!");
        conhecimento.put("Como você está?", "Estou bem! E você?");
    }

    // Função funcional para responder de forma dinâmica
    private Function<String, String> responder = (String pergunta) -> {
        if (conhecimento.containsKey(pergunta)) {
            return conhecimento.get(pergunta);
        } else {
            return "Ainda não sei como responder isso. Como você gostaria que eu respondesse?";
        }
    };

    // Método para adicionar nova resposta ao chatbot
    public void aprender(String pergunta, String resposta) {
        conhecimento.put(pergunta, resposta);
    }

    // Método para iniciar o chatbot
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Sou seu chatbot inovador. Pergunte-me algo!");

        while (true) {
            String pergunta = scanner.nextLine();
            String resposta = responder.apply(pergunta);

            System.out.println(resposta);

            // Se o chatbot não souber a resposta, ele vai aprender
            if (resposta.contains("ainda não sei como responder")) {
                System.out.println("Por favor, ensine-me a resposta:");
                String novaResposta = scanner.nextLine();
                aprender(pergunta, novaResposta);
                System.out.println("Obrigado! Agora sei como responder isso.");
            }

            // Permitir ao usuário encerrar a conversa
            if (pergunta.equalsIgnoreCase("sair")) {
                System.out.println("Tchau! Até a próxima.");
                break;
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        InovadorChatBot chatbot = new InovadorChatBot();
        chatbot.iniciar();
    }
}
