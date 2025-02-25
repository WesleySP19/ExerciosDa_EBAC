package Modulo_13.Exercicio;

import java.util.ArrayList;
import java.util.List;

// Classe para gerenciar o cadastro de pessoas
public class CadastroPessoas {
    // Lista para armazenar as pessoas
    private List<Pessoa> pessoas;

    // Construtor
    public CadastroPessoas() {
        this.pessoas = new ArrayList<>();
    }

    // Método para adicionar uma pessoa
    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
        System.out.println("Pessoa adicionada com sucesso!");
    }

    // Método para listar todas as pessoas
    public void listarPessoas() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            System.out.println("Lista de Pessoas:");
            for (Pessoa pessoa : pessoas) {
                pessoa.exibirInformacoes();
            }
        }
    }
}