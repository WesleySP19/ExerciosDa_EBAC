import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainSwing {
    private UsuarioRepository repository;
    private DefaultTableModel tableModel;

    public MainSwing() {
        repository = new UsuarioRepository();
        criarInterfaceGrafica();
    }

    private void criarInterfaceGrafica() {
        JFrame frame = new JFrame("Sistema de Cadastro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        JLabel lblNome = new JLabel("Nome Completo:");
        JTextField txtNome = new JTextField(20);
        JLabel lblApelido = new JLabel("Apelido:");
        JTextField txtApelido = new JTextField(20);
        JLabel lblEmail = new JLabel("Email:");
        JTextField txtEmail = new JTextField(20);
        JLabel lblIdade = new JLabel("Idade:");
        JTextField txtIdade = new JTextField(5);
        JLabel lblTelefone = new JLabel("Telefone:");
        JTextField txtTelefone = new JTextField(15);

        JButton btnCriar = new JButton("Criar");
        JButton btnAtualizar = new JButton("Atualizar");
        JButton btnDeletar = new JButton("Deletar");
        JButton btnLimpar = new JButton("Limpar");

        String[] colunas = {"ID", "Nome", "Apelido", "Email", "Idade", "Telefone"};
        tableModel = new DefaultTableModel(colunas, 0);
        JTable tabela = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(tabela);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addComponent(txtNome)
                                .addComponent(lblApelido)
                                .addComponent(txtApelido))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmail)
                                .addComponent(txtEmail)
                                .addComponent(lblIdade)
                                .addComponent(txtIdade))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTelefone)
                                .addComponent(txtTelefone))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCriar)
                                .addComponent(btnAtualizar)
                                .addComponent(btnDeletar)
                                .addComponent(btnLimpar))
                        .addComponent(scrollPane)
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNome)
                                .addComponent(txtNome)
                                .addComponent(lblApelido)
                                .addComponent(txtApelido))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblEmail)
                                .addComponent(txtEmail)
                                .addComponent(lblIdade)
                                .addComponent(txtIdade))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTelefone)
                                .addComponent(txtTelefone))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCriar)
                                .addComponent(btnAtualizar)
                                .addComponent(btnDeletar)
                                .addComponent(btnLimpar))
                        .addComponent(scrollPane)
        );

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainSwing::new);
    }
}
