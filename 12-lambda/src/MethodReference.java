import java.util.ArrayList;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Felipe");
        nomes.add("Maria");
        nomes.add("João");

        // Lambda

        System.out.println("Lambda:");

        nomes.forEach(nome -> System.out.println(nome));

        // Method Reference

        System.out.println("\nMethod Reference:");

        nomes.forEach(System.out::println);

        // Referência para método de instância

        List<String> nomesMaiusculos = nomes.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("\nNomes em maiúsculo:");

        nomesMaiusculos.forEach(System.out::println);

        // Referência para método estático

        List<Integer> numeros = List.of(-10, 20, -30, 40);

        List<Integer> valoresAbsolutos = numeros.stream()
                .map(Math::abs)
                .toList();

        System.out.println("\nValores absolutos:");

        valoresAbsolutos.forEach(System.out::println);

    }

}
