public class Sobrecarga {
    public static void main(String[] args){

        // Mesmo nome, quantidade de parâmetros diferente
        System.out.println("Soma (2 números): " + somar(10, 5));
        System.out.println("Soma (3 números): " + somar(70, 37, 14));

        // Mesmo nome, tipos diferentes
        System.out.println("Soma de double: " + somar(3.8, 9.1));

        // Mesmo nome, ordem dos parâmetros diferente
        imprimir("Felipe", 26);
        imprimir(26, "Felipe");
    }

    // SOBRECARGA POR QUANTIDADE DE PARÂMETROS
    public static int somar(int a, int b){
        return a + b;
    }

    public static int somar(int a, int b, int c){
        return a + b + c;
    }

    // SOBRECARGA POR TIPO DOS PARÂMETROS
    public static double somar(double a, double b){
        return a + b;
    }

    // SOBRECARGA POR ORDEM DOS PARÂMETROS
    public static void imprimir(String nome, int idade){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void imprimir(int idade, String nome){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
