package Modulo_13.Exercicio;

// Subclasse PessoaJuridica
public class PessoaJuridica extends Pessoa {
    // Propriedade específica
    private String cnpj;

    // Construtor
    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    // Getter para o CNPJ
    public String getCnpj() {
        return cnpj;
    }

    // Setter para o CNPJ
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Implementação do método abstrato
    @Override
    public void exibirInformacoes() {
        System.out.println("Pessoa Jurídica: " + getNome() + ", CNPJ: " + cnpj);
    }
}