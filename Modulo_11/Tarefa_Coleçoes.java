import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tarefa_Coleçoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PARTE 1 ===");
        System.out.println("Digite os nomes separados por vírgula:");
        String inputNomes = scanner.nextLine();

        String[] nomesArray = inputNomes.split(",");

        List<String> nomes = new ArrayList<>(Arrays.asList(nomesArray));

        for (int i = 0; i < nomes.size(); i++) {
            nomes.set(i, nomes.get(i).trim());
        }
        Collections.sort(nomes);

        System.out.println("\nNomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("\n=== PARTE 2 ===");
        System.out.println("Digite os nomes e sexos no formato 'Nome - M' ou 'Nome - F' (separados por vírgula):");
        String inputGeneros = scanner.nextLine();

        String[] entradas = inputGeneros.split(",");

        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        for (String entrada : entradas) {
            String[] partes = entrada.split("-");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim();

                if (sexo.equalsIgnoreCase("M")) {
                    masculinos.add(nome);
                } else if (sexo.equalsIgnoreCase("F")) {
                    femininos.add(nome);
                }
            }
        }

        System.out.println("\nNomes masculinos:");
        for (String nome : masculinos) {
            System.out.println(nome);
        }

        System.out.println("\nNomes femininos:");
        for (String nome : femininos) {
            System.out.println(nome);
        }

        scanner.close();
    }
}