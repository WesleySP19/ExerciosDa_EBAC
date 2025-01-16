import java.util.Scanner;

public class Aluno {
    private String nome;
    private double[] notas;

    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new double[4];
    }


    public void lerNotas() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota " + (i + 1) + " do aluno " + nome + ": ");
            this.notas[i] = scanner.nextDouble();
        }
    }


    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }


    public void verificarSituacao() {
        double media = calcularMedia();
        System.out.println("Média do aluno " + nome + ": " + media);

        if (media >= 7) {
            System.out.println(nome + " está APROVADO!");
        } else if (media >= 5) {
            System.out.println(nome + " está em RECUPERAÇÃO!");
        } else {
            System.out.println(nome + " está REPROVADO!");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Nome do aluno: ");
        String nomeAluno = scanner.nextLine();


        Aluno aluno = new Aluno(nomeAluno);


        aluno.lerNotas();


        aluno.verificarSituacao();

        scanner.close();
    }
}
