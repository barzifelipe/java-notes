public class ReplaceRegex {
    public static void main(String[] args) {

        // replaceAll()
        // Substitui todas as ocorrências.
        String texto = "Java 17, Java 21 e Java 24";

        System.out.println("replaceAll():");
        System.out.println(texto.replace("Java", "Python"));

        // repalceFirst()
        // Substitui apenas a primeira ocorrência

        System.out.println("\nreplaceFirst():");
        System.out.println(texto.replaceFirst("Java", "Python"));

        // Removendo números

        String codigo = "Produto123";

        System.out.println("\nRemovendo números:");
        System.out.println(codigo.replaceAll("\\d",""));

        // Mantendo apenas números

        String telefone = "(27) 99999-9999";

        System.out.println("\nMantendo apenas números:");
        System.out.println(telefone.replaceAll("\\D", ""));

        // Removendo espaçoes extras

        String frase = "Java    Notes      Regex";

        System.out.println("Removendo espaços extras:");
        System.out.println(frase.replaceAll("\\s+", " "));

        // Removendo caracteres especiais

        String senha = "Java@123!";

        System.out.println("\nRemovendo caracteres especiais");
        System.out.println(senha.replaceAll("[^A-Za-z0-9]", ""));

        // Substituindo vogais

        String linguagem = "Programação Java";

        System.out.println("\nSubstituindo vogais:");
        System.out.println(linguagem.replaceAll("[AEIOUaeiou]", "*"));

        // Removendo letras

        String texto2 = "ABC123XYZ";

        System.out.println("\nRemovendo letras:");
        System.out.println(texto2.replaceAll("[A-Za-z]", ""));
    }
}
