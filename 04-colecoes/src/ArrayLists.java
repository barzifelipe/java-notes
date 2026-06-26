import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args){
        // CRIAÇÃO
        ArrayList<String> nomes = new ArrayList<>();

        // ADICIONANDO ELEMENTOS
        nomes.add("Felipe");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        // ACESSANDO ELEMENTOS
        System.out.println("\nPrimeiro nome: " + nomes.get(0));

        // ALTERANDO ELEMENTOS
        nomes.set(1, "Ana");

        System.out.println("\nApós alterações:");
        System.out.println(nomes);

        // REMOVENDO ELEMENTOS
        nomes.remove("João");

        System.out.println("\nApós remoção:");
        System.out.println(nomes);

        // TAMANHO
        System.out.println("\nQuantidade de elementos: " + nomes.size());

        // VERIFICANDO EXISTÊNCIA
        System.out.println("\nContém Felipe? " + nomes.contains("Felipe"));

        // PERCORRENDO COM FOR
        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        // PERCORRENDO COM FOR-EACH
        for (String nome : nomes){
            System.out.println(nome);
        }

        // LIMPANDO A LISTA
        nomes.clear();
        System.out.println("\nLista vazia? " + nomes.isEmpty());
    }
}
