package cursoJava2024;

import java.util.Scanner;

// Classe base Pessoa
class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void falar() {
        System.out.println(nome + " está falando.");
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    // Método para obter o nome
    public String getNome() {
        return nome;
    }
}

// Classe Aluno que herda de Pessoa
class Aluno extends Pessoa {
    public Aluno(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void falar() {
        System.out.println(getNome() + " é um aluno e está estudando.");
    }
}

// Classe Professor que herda de Pessoa
class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void falar() {
        System.out.println(getNome() + " é um professor de " + disciplina + " e está ensinando.");
    }
}

// Classe principal
public class Cap9Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando objetos do tipo Aluno
        System.out.println("Digite os dados do primeiro aluno:");
        System.out.print("Nome: ");
        String nomeAluno1 = scanner.nextLine();
        System.out.print("Idade: ");
        int idadeAluno1 = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        Aluno aluno1 = new Aluno(nomeAluno1, idadeAluno1);

        System.out.println("Digite os dados do segundo aluno:");
        System.out.print("Nome: ");
        String nomeAluno2 = scanner.nextLine();
        System.out.print("Idade: ");
        int idadeAluno2 = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        Aluno aluno2 = new Aluno(nomeAluno2, idadeAluno2);

        // Criando objeto do tipo Professor
        System.out.println("Digite os dados do professor:");
        System.out.print("Nome: ");
        String nomeProfessor = scanner.nextLine();
        System.out.print("Idade: ");
        int idadeProfessor = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        System.out.print("Disciplina: ");
        String disciplinaProfessor = scanner.nextLine();

        Professor professor = new Professor(nomeProfessor, idadeProfessor, disciplinaProfessor);

        // Usando o método falar com cada objeto
        aluno1.falar();
        aluno2.falar();
        professor.falar();

        // Mostrando os dados de cada objeto
        System.out.println("\nDados do Aluno 1:");
        aluno1.mostrarDados();

        System.out.println("\nDados do Aluno 2:");
        aluno2.mostrarDados();

        System.out.println("\nDados do Professor:");
        professor.mostrarDados();

        // Fechar o scanner
        scanner.close();
    }
}
