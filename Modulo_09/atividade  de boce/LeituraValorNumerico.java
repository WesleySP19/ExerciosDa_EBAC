import java.util.Scanner;

public class LeituraValorNumerico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numeroInteiroPrimitivo = scanner.nextInt();
        // Convertendo o valor primitivo para o tipo wrapper Integer
        Integer numeroInteiro = Integer.valueOf(numeroInteiroPrimitivo);

        // Lendo um número de ponto flutuante (double)
        System.out.print("Digite um número de ponto flutuante: ");
        double numeroDecimalPrimitivo = scanner.nextDouble();
        // Convertendo o valor primitivo para o tipo wrapper Double
        Double numeroDecimal = Double.valueOf(numeroDecimalPrimitivo);

        // Mostrando os valores lidos (com as variáveis do tipo wrapper)
        System.out.println("Número inteiro: " + numeroInteiro);
        System.out.println("Número decimal: " + numeroDecimal);

        scanner.close();
    }
}
