import java.util.ArrayList;
import java.util.List;

public class IntroducaoGenerics {

    public static void main(String[] args) {

        // Sem Generics
        // A lista aceita qualquer tipo de objeto.

        List<Object> lista = new ArrayList<>();

        lista.add("Java");
        lista.add(10);
        lista.add(true);

        System.out.println(lista);

        // Ao recuperar um elemento, é necessário fazer cast.

        String texto = (String) lista.get(0);

        System.out.println(texto);

        // Se o cast for incorreto, ocorre uma exceção em tempo de execução.

        // String numero = (String) lista.get(1);

        // Com Generics
        // A lista aceita apenas Strings.

        List<String> nomes = new ArrayList<>();

        nomes.add("Felipe");
        nomes.add("João");

        // nomes.add(10); // Erro de compilação

        System.out.println("\nLista de nomes:");
        System.out.println(nomes);

        // Não é necessário fazer cast.

        String nome = nomes.get(0);

        System.out.println(nome);

        // Outro exemplo

        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println("\nLista de números:");
        System.out.println(numeros);

        Integer numero = numeros.get(0);

        System.out.println(numero);

    }

}
