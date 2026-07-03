import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("===Início do programa===");

        System.out.println("Digite o numerador: ");
        int numerador = scan.nextInt();

        System.out.println("Digite o denominador: ");
        int denominador = scan.nextInt();

        try{
            double resultado = numerador/denominador;
            System.out.println(resultado);
        }

        catch (ArithmeticException e){
            System.out.println("Erro: não é possível dividir um número por 0");
            System.out.println(e.getMessage());
        }

        finally {
            scan.close();
        }
    }
}
