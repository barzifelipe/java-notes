import java.util.List;

public class Wildcards {
    public static void main(String[] args) {

        List<String> nomes = List.of("Felipe", "João", "Maria");
        List<Integer> numeros = List.of(10, 20, 30);
        List<Double> notas = List.of(8.5, 9.0, 10.0);
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
