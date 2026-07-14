/*
 * StringBuilder é uma classe utilizada para manipular texto
 * de forma eficiente. Diferente de String, seu conteúdo pode
 * ser alterado sem criar um novo objeto a cada modificação.
 *
 * É recomendado quando há muitas concatenações,
 * principalmente dentro de loops.
 */

public class StringBuilderExemplo {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= 5; i++){
            sb.append(i).append(" ");
        }

        System.out.println(sb);

        StringBuilder nome = new StringBuilder("Felipe");

        // append
        nome.append(" Barzilai");

        System.out.println("\nappend():");
        System.out.println(nome);

        // insert()
        nome.insert(7, "Rodrigues ");

        System.out.println("\ninsert():");
        System.out.println(nome);

        // delete()
        nome.delete(7, 17);

        System.out.println("\ndelete():");
        System.out.println(nome);

        // reverse()
        nome.reverse();

        System.out.println("\nreverse():");
        System.out.println(nome);

        // toString()
        String nomeFinal = nome.reverse().toString();

        System.out.println("\ntoString():");
        System.out.println(nomeFinal);

        // length()
        System.out.println("\nlength");
        System.out.println(nomeFinal.length());
    }
}
