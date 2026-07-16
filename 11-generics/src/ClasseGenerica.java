/*
 * T é um parâmetro de tipo (Type Parameter).
 *
 * Quando a classe é utilizada, o T é substituído
 * pelo tipo informado.
 *
 * Exemplo:
 *
 * Caixa<String>  -> T será String
 * Caixa<Integer> -> T será Integer
 * Caixa<Double>  -> T será Double
 */

public class ClasseGenerica {
    public static void main(String[] args) {

        // A Caixa armazenará Strings

        Caixa<String> caixaString = new Caixa<>("Felipe", 10);

        caixaString.setObjeto("Notebook");

        System.out.println("Proprietário: " + caixaString.getProprietario());
        System.out.println("Capacidade: " + caixaString.getCapacidade());
        System.out.println("Objeto: " + caixaString.getObjeto());


        // A Caixa armazenará Integers

        Caixa<Integer> caixaInteiro = new Caixa<>("João", 20);

        caixaInteiro.setObjeto(100);

        System.out.println("\nProprietário: " + caixaInteiro.getProprietario());
        System.out.println("Capacidade: " + caixaInteiro.getCapacidade());
        System.out.println("Objeto: " + caixaInteiro.getObjeto());

        // A Caixa armazenará Doubles

        Caixa<Double> caixaDouble = new Caixa<>("Maria", 15);

        caixaDouble.setObjeto(9.8);

        System.out.println("\nProprietário: " + caixaDouble.getProprietario());
        System.out.println("Capacidade: " + caixaDouble.getCapacidade());
        System.out.println("Objeto: " + caixaDouble.getObjeto());
    }
}
