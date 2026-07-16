import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {

        List<String> nomes = List.of("Felipe", "João", "Maria");
        List<Integer> numeros = List.of(10, 20, 30);
        List<Double> notas = List.of(8.5, 9.0, 10.0);

        // Qualquer tipo de lista

        imprimirLista(nomes);
        imprimirLista(numeros);
        imprimirLista(notas);

        System.out.println();

        // extends

        List<Integer> inteiros = new ArrayList<>();
        inteiros.add(10);
        inteiros.add(20);

        List<Double> doubles = new ArrayList<>();
        doubles.add(5.5);
        doubles.add(7.8);

        System.out.println("Soma dos inteiros: " + somar(inteiros));
        System.out.println("Soma dos doubles: " + somar(doubles));

        System.out.println();

        // super

        List<Number> lista = new ArrayList<>();

        adicionarNumero(lista);

        System.out.println(lista);

    }

    // Aceita qualquer tipo de lista.

    public static void imprimirLista(List<?> lista){

        for(Object elemento : lista) {
            System.out.println(elemento);
        }
    }

    // Aceita Number e qualquer subclasse de Number.

    public static double somar(List<? extends Number> lista){

        double soma = 0;

        for (Number numero : lista){
            soma += numero.doubleValue();
        }

        return soma;
    }

    // Aceita Integer ou qualquer superclasse de Integer.

    public static void adicionarNumero(List<? super Integer> lista){
        lista.add(10);
        lista.add(20);
    }
}
