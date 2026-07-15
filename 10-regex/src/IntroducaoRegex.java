import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IntroducaoRegex {
    public static void main(String[] args) {

        String texto = "Estou estudando Java";

        // Pattern.compile()
        // Cria um padrão de busca.
        Pattern pattern = Pattern.compile("Java");

        // matcher()
        // Associa o padrão ao texto.
        Matcher matcher = pattern.matcher(texto);

        // find()
        // Procura a próxima ocorrência do padrão.
        System.out.println("find():");
        System.out.println(matcher.find());

        matcher.reset();

        // group()
        // Retorna o trecho encontrado.
        if(matcher.find()){
            System.out.println("\ngroup():");
            System.out.println(matcher.group());
        }

        matcher.reset();

        // start() e end()
        // Retornam as posições onde ocorreu a correspondência.
        if (matcher.find()){
            System.out.println("\nstart(): " + matcher.start());
            System.out.println("end(): " + matcher.end());
        }

        matcher.reset();

        // matches()
        // Verifica se toda a String corresponde ao padrão.

        System.out.println("\nmatches():");
        System.out.println("Java".matches("Java"));
        System.out.println(texto.matches("Java"));


        // \\d
        // Representa qualquer dígito único.

        System.out.println("\n\\d");
        System.out.println("5".matches("\\d"));
        System.out.println("A".matches("\\d"));

        // \\w
        // Representa letras, números e _ únicos.

        System.out.println("\n\\w");
        System.out.println("B".matches("\\w"));
        System.out.println("_".matches("\\w"));

        // \\s
        // Representa um espaço em branco.

        System.out.println("\n\\s");
        System.out.println(" ".matches("\\s"));

        // [a-z]
        // Letras minúsculas.

        System.out.println("\n[a-z]");
        System.out.println("f".matches("[a-z]"));

        // [A-Z]
        // Letras maiúsculas.

        System.out.println("\n[A-Z]");
        System.out.println("F".matches("[A-Z]"));

        // Quantificador +

        System.out.println("\n+");
        System.out.println("123".matches("\\d+"));

        // Quantificador *

        System.out.println("\n*");
        System.out.println("".matches("\\d*"));
        System.out.println("123".matches("\\d*"));

        // Quantificador ?

        System.out.println("\n?");
        System.out.println("9".matches("\\d?"));
        System.out.println("".matches("\\d?"));

        // Quantificador {n}

        System.out.println("\n{n}");
        System.out.println("12345".matches("\\d{5}"));

        // Quantificador {n,m}

        System.out.println("\n{n,m}");
        System.out.println("1234".matches("\\d{3,5}"));
        System.out.println("123456".matches("\\d{3,5}"));
    }
}
