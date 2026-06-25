import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // DO-WHILE
        int i = 1;

        do{
            System.out.println("Número: " + i);
            i++;
        }while (i <= 5);

        // CONTAGEM REGRESSIVA
        int j = 5;

        do{
            System.out.println(j);
            j--;
        }while (j >= 1);

        // SOMA COM DO-WHILE
        int k = 1;
        int soma = 0;

        do{
            soma += k;
            k++;
        }while(k <= 10);

        System.out.println("Soma de 1 a 10: " + soma);

        // VALIDAÇÂO
        int numero;

        do{
            System.out.println("Digite um número positivo: ");
            numero = scan.nextInt();

            if (numero <= 0){
                System.out.println("Número inválido");
            }
        }while (numero <= 0);

        System.out.println("Número válido " + numero);

        scan.close();
    }
}
