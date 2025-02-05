import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GrupoPorSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> grupos = new HashMap<>();

        grupos.put("Masculino", new ArrayList<>());
        grupos.put("Feminino", new ArrayList<>());

        System.out.print("Quantas pessoas você quer cadastrar? ");
        int numeroDePessoas = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numeroDePessoas; i++) {
            System.out.print("Digite o nome da pessoa #" + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sexo (M/F) da pessoa #" + (i + 1) + ": ");
            String sexo = scanner.nextLine().toUpperCase();  // Converte para maiúsculo

            if (sexo.equals("M")) {
                grupos.get("Masculino").add(nome);
            } else if (sexo.equals("F")) {
                grupos.get("Feminino").add(nome);
            } else {
                System.out.println("Sexo inválido, por favor use M ou F.");
            }
        }

        System.out.println("\nGrupo Masculino:");
        for (String nome : grupos.get("Masculino")) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : grupos.get("Feminino")) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
