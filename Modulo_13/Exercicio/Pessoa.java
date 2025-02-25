package Modulo_13.Exercicio;

// Classe abstrata Pessoa
public abstract class Pessoa {
    // Propriedade comum
    private String nome;

    // Construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método abstrato (deve ser implementado pelas subclasses)
    public abstract void exibirInformacoes();
}