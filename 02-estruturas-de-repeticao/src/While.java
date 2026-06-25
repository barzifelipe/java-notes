public class While {
    public static void main(String[] args){

        // WHILE
        int i = 1;

        while (i <= 5){
            System.out.println("Número: " + i);
            i++;
        }

        // CONTAGEM REGRESSIVA
        int j = 5;

        while (j >= 1){
            System.out.println(j);
            j--;
        }

        // SOMA COM WHILE
        int k = 1;
        int soma = 0;

        while (k <= 10){
            soma += k;
            k++;
        }

        System.out.println("Soma de 1 a 10: " + soma);

        // WHILE COM CONDIÇÃO (VALIDAÇÃO)
        int numero = 0;

        while(numero <= 0){
            System.out.println("Número inválido: " + numero);
            System.out.println("Aguardando número positivo");
            numero++;
        }

        System.out.println("Número válido: " + numero);
    }
}
