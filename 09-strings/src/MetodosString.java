public class MetodosString {
    public static void main(String[] args) {

        String texto = "  Java Notes  ";

        // charAt()
        // Retorna o caractere de uma posição.

        System.out.println("\ncharAt():");
        System.out.println(texto.charAt(5));

        // substring()
        // Retorna parte da String.

        System.out.println("\nsubstring():");
        System.out.println(texto.substring(4));
        System.out.println(texto.substring(4, 9));


        // indexOf()
        // Retorna a primeira ocorrência.

        System.out.println("\nindexOf():");
        System.out.println(texto.indexOf("a"));

        // lastIndexOf()
        // Retorna a última ocorrência.

        System.out.println("\nlastIndexOf():");
        System.out.println(texto.lastIndexOf("a"));

        // contains()
        // Verifica se a String contém determinado texto.

        System.out.println("\ncontains():");
        System.out.println(texto.contains("ava"));

        // startsWith()
        // Verifica se começa com determinado texto.

        System.out.println("\nstartsWith():");
        System.out.println(texto.startsWith("  Ja"));

        // endsWith()
        // Verifica se termina com determinado texto.

        System.out.println("\nendsWith():");
        System.out.println(texto.endsWith("tes  "));

        // replace()
        // Substitui caracteres ou palavras.

        System.out.println("\nreplace():");
        System.out.println(texto.replace("Java", "Python"));

        // split()
        // Divide uma String.

        System.out.println("\nsplit():");
        String linguagens = "Java,Python,C#,Javascript";

        String[] vetor = linguagens.split(",");

        for(String linguagem : vetor) {
            System.out.println(linguagem);
        }

        // trim()
        // Remove espaços das extremidades.

        System.out.println("\ntrim():");
        System.out.println(texto.trim());

        // toUpperCase()
        // Converte para maiúsculas.

        System.out.println("\ntoUpperCase():");
        System.out.println(texto.toUpperCase());

        // toLowerCase()
        // Converte para minúsculas.

        System.out.println("\ntoLowerCase():");
        System.out.println(texto.toLowerCase());

        // isEmpty()
        // Verifica se a String possui tamanho 0.

        String vazio = "";

        System.out.println("\nisEmpty():");
        System.out.println(vazio.isEmpty());

        // isBlank()
        // Verifica se a String está vazia ou contém apenas espaços.

        String espacos = "     ";

        System.out.println("\nisBlank():");
        System.out.println(espacos.isBlank());
    }
}
