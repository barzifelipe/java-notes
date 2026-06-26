public class Parametros {
    public static void main(String[] args){
        saudar("Felipe");

        somar(14, 7);

        calcularArea(5, 3);
    }

    public static void saudar(String nome){
        System.out.println("Olá " + nome + "!");
    }

    public static void somar(int a, int b){
        System.out.println(a + b);
    }

    public static void calcularArea(double base, double altura){
        System.out.println(base * altura);
    }
}
