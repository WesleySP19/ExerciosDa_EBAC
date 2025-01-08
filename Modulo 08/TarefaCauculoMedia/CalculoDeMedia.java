import java.util.Scanner;
import javax.swing.JOptionPane;

public class CalculoDeMedia {
    public static void main(String[] args) {
        // Declaração das variáveis para armazenar as notas
        double nota1, nota2, nota3, nota4;

        // Leitura das notas do usuário usando painel
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));

        // Cálculo da média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Exibição do resultado no painel
        JOptionPane.showMessageDialog(null, String.format("A média das notas é: %.2f", media));
    }
}
