import java.util.ArrayList;
import java.util.List;

public class LambdaComColecoes {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Felipe");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana");
        nomes.add("Carlos");

        // forEach()
        // Percorre todos os elementos da lista.

        System.out.println("forEach():");

        nomes.forEach(nome -> System.out.println(nome));

        // sort()
        // Ordena a lista.

        nomes.sort((nome1, nome2) -> nome1.compareTo(nome2));

        System.out.println("\nApós sort():");

        nomes.forEach(System.out::println);

        // removeIf()
        // Remove elementos que atendem a uma condição.

        nomes.removeIf(nome -> nome.startsWith("A"));

        System.out.println("\nApós removeIf():");

        nomes.forEach(System.out::println);

        // replaceAll()
        // Substitui cada elemento da lista.

        nomes.replaceAll(nome -> nome.toUpperCase());

        System.out.println("\nApós replaceAll():");

        nomes.forEach(System.out::println);

    }
}
