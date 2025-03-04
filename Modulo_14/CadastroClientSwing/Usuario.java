public class Usuario {
    private int id;
    private String nomeCompleto;
    private String apelido;
    private String email;
    private int idade;
    private String telefone;

    public Usuario(int id, String nomeCompleto, String apelido, String email, int idade, String telefone) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.apelido = apelido;
        this.email = email;
        this.idade = idade;
        this.telefone = telefone;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }

    public String getApelido() { return apelido; }
    public void setApelido(String apelido) { this.apelido = apelido; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome Completo: " + nomeCompleto + ", Apelido: " + apelido +
                ", Email: " + email + ", Idade: " + idade + ", Telefone: " + telefone;
    }
}