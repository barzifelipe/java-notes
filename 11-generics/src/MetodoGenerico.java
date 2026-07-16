import java.util.List;

public class MetodoGenerico {
    public static void main(String[] args) {
        imprimir("Java");
        imprimir(10);
        imprimir(3.14);
        imprimir(true);

        System.out.println();

        List<String> nomes = List.of("Felipe", "João", "Maria");
        List<Integer> numeros = List.of(10, 20, 30);

        imprimirLista(nomes);
        imprimirLista(numeros);

        System.out.println();

        String primeiroNome = primeiroElemento(nomes);
        Integer primeiroNumero = primeiroElemento(numeros);

        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Primeiro número: " + primeiroNumero);
    }

    // Método genérico.
    // T representa qualquer tipo.

    public static <T> void imprimir(T valor){
        System.out.println(valor);
    }

    // Método genérico que recebe uma lista.

    public static <T> void imprimirLista(List<T> lista){
        for(T elemnto : lista){
            System.out.println(elemnto);
        }
    }

    // Método genérico com retorno.
    // Retorna o primeiro elemento da lista.

    public static <T> T primeiroElemento(List<T> lista){
        return lista.getFirst();
    }
}
