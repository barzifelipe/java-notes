/*
 * Consumer<T>
 * Recebe T
 * Retorna void
 * Método: accept()
 *
 * Predicate<T>
 * Recebe T
 * Retorna boolean
 * Método: test()
 *
 * Function<T, R>
 * Recebe T
 * Retorna R
 * Método: apply()
 *
 * Supplier<T>
 * Não recebe parâmetros
 * Retorna T
 * Método: get()
 */

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        // Consumer
        // Recebe um valor e não retorna nada.

        Consumer<String> consumidor = nome -> System.out.println("Olá, " + nome);

        consumidor.accept("Felipe");

        System.out.println();

        // Predicate
        // Recebe um valor e retorna um boolean.

        Predicate<Integer> ehPar = numero -> numero % 2 == 0;

        System.out.println(ehPar.test(10));
        System.out.println(ehPar.test(15));

        System.out.println();

        // Function
        // Recebe um valor e retorna outro.

        Function<String, Integer> tamanho = texto -> texto.length();

        System.out.println(tamanho.apply("Java"));

        System.out.println();

        // Supplier
        // Não recebe parâmetros e retorna um valor.

        Supplier<Double> numeroAleatorio = () -> Math.random();

        System.out.println(numeroAleatorio.get());

    }

}
