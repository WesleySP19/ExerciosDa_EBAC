package Modulo_13.Exercicio;

import java.util.Scanner;

// Classe principal para interação com o usuário
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroPessoas cadastro = new CadastroPessoas();

        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar Pessoa Física");
            System.out.println("2. Cadastrar Pessoa Jurídica");
            System.out.println("3. Listar Pessoas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nomeFisica = scanner.nextLine();
                    System.out.print("Digite o CPF: ");
                    String cpf = scanner.nextLine();
                    PessoaFisica pf = new PessoaFisica(nomeFisica, cpf);
                    cadastro.adicionarPessoa(pf);
                    break;

                case 2:
                    System.out.print("Digite o nome: ");
                    String nomeJuridica = scanner.nextLine();
                    System.out.print("Digite o CNPJ: ");
                    String cnpj = scanner.nextLine();
                    PessoaJuridica pj = new PessoaJuridica(nomeJuridica, cnpj);
                    cadastro.adicionarPessoa(pj);
                    break;

                case 3:
                    cadastro.listarPessoas();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}