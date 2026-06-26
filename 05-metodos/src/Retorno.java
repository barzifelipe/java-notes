public class Retorno {
    public static void main(String[] args){

        int soma = somar(46, 12);
        double media = calcularMedia(9, 7);
        boolean ehMaior = verificarIdade(19);

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("É maior de idade? " + ehMaior);
    }

    public static int somar(int a, int b){
        return a + b;
    }

    public static double calcularMedia(double n1, double n2){
        return (n1 + n2)/2;
    }

    public static boolean verificarIdade(int idade){
        return idade >= 18;
    }
}
