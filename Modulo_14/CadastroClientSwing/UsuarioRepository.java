import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    private List<Usuario> usuarios;
    private int proximoId;

    public UsuarioRepository() {
        this.usuarios = new ArrayList<>();
        this.proximoId = 1;
    }

    public void criarUsuario(String nomeCompleto, String apelido, String email, int idade, String telefone) {
        Usuario novoUsuario = new Usuario(proximoId, nomeCompleto, apelido, email, idade, telefone);
        usuarios.add(novoUsuario);
        proximoId++;
    }

    public Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    public boolean atualizarUsuario(int id, String nomeCompleto, String apelido, String email, int idade, String telefone) {
        Usuario usuario = buscarUsuarioPorId(id);
        if (usuario != null) {
            usuario.setNomeCompleto(nomeCompleto);
            usuario.setApelido(apelido);
            usuario.setEmail(email);
            usuario.setIdade(idade);
            usuario.setTelefone(telefone);
            return true;
        }
        return false;
    }

    public boolean deletarUsuario(int id) {
        Usuario usuario = buscarUsuarioPorId(id);
        if (usuario != null) {
            usuarios.remove(usuario);
            return true;
        }
        return false;
    }
}