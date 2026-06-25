public class For {
    public static void main(String[] args){

        // FOR
        for (int i = 1; i <= 5; i++){
            System.out.println("Número: " + i);
        }

        // CONTAGEM REGRESSIVA
        for (int i = 5; i >= 1; i--){
            System.out.println(i);
        }

        // SOMA DE NÚMEROS
        int soma = 0;

        for(int i = 1; i <= 10; i++){
            soma += i;
        }

        System.out.println("Soma de 1 a 10: " + soma);

        // TABUADA
        int n = 4;

        for(int i = 1; i <= 10; i++){
            int resultado = n*i;
            System.out.println(n + "x" + i +" = " + resultado);
        }

        // PERCORRENDO ARRAYS
        String[] nomes = {"Felipe", "Maria", "João"};

        for(int i = 0; i < nomes.length; i++){
            System.out.println("Posição " + i + ": " + nomes[i]);
        }

        // FOR-EACH
        for (String nome : nomes){
            System.out.println(nome);
        }
    }
}
