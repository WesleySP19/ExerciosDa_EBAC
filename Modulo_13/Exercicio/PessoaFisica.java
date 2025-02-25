package Modulo_13.Exercicio;

// Subclasse PessoaFisica
public class PessoaFisica extends Pessoa {
    // Propriedade específica
    private String cpf;

    // Construtor
    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    // Getter para o CPF
    public String getCpf() {
        return cpf;
    }

    // Setter para o CPF
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Implementação do método abstrato
    @Override
    public void exibirInformacoes() {
        System.out.println("Pessoa Física: " + getNome() + ", CPF: " + cpf);
    }
}