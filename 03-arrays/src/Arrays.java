public class Arrays {
    public static void main(String[] args){

        // Declaração e inicialização
        int[] numeros = {10, 20, 30, 40, 50};

        // Acessando elementos
        System.out.println("Primeiro elemento: " + numeros[0]);
        System.out.println("Último elemento: " + numeros[numeros.length - 1]);

        // Alterando um elemento
        numeros[2] = 100;

        // Tamanho do array
        System.out.println("Quantidade de elementos: " + numeros.length);

        // Percorrendo com for
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Posição " + i + ": " + numeros[i]);
        }

        // Percorrendo com for-each
        for(int numero : numeros){
            System.out.println(numero);
        }

        // Array de Strings
        String[] nomes = {"Felipe", "Maria", "João"};

        for(String nome : nomes){
            System.out.println(nome);
        }

        // Criando um array vazio
        int[] notas = new int[5];

        notas[0] = 8;
        notas[1] = 7;
        notas[2] = 10;
        notas[3] = 9;
        notas[4] = 6;

        for (int nota : notas){
            System.out.println(nota);
        }
    }
}
