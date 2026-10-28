package AT12;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade do aluno: ");
        String idadeTexto = scanner.nextLine();
        try {
            int idade = Integer.parseInt(idadeTexto);
            Aluno aluno = new Aluno(nome, idade);
            System.out.println("\n--- Dados do aluno ---");
            aluno.exibirDados();
        } catch (NumberFormatException e) {
            System.out.println("Digite um número inteiro.");
        } finally {
            System.out.println("Tentativa de cadastro finalizada.");
        }
        scanner.close();
    }
}
