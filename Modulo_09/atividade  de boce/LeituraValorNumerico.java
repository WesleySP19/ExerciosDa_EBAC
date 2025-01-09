import java.util.Scanner;

public class LeituraValorNumerico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();


        System.out.print("Digite um número de ponto flutuante: ");
        double numeroDecimal = scanner.nextDouble();


        System.out.println("Número inteiro: " + numeroInteiro);
        System.out.println("Número decimal: " + numeroDecimal);

        scanner.close();
    }
}