public class Matrizes {
    public static void main(String[] args){

        // DECLARAÇÃO E INICIALIZAÇÃO
        int [][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // ACESSANDO ELEMENTOS
        System.out.println("Primeiro elemento: " + matriz[0][0]);
        System.out.println("Elemento central: " + matriz[1][1]);
        System.out.println("Último elemento: " + matriz[2][2]);

        // ALTERANDO ELEMENTOS
        matriz[1][2] = 10;

        System.out.println("\nNovo valor da posição [1][2]: " + matriz[1][2]);

        // QUANTIDADE DE LINHAS E COLUNAS
        System.out.println("Linhas: " + matriz.length);
        System.out.println("Colunas: " + matriz[0].length);

        // PERCORRENDO COM FOR
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }

        // SOMA DOS ELEMENTOS
        int soma = 0;

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                soma += matriz[linha][coluna];
            }
        }

        System.out.println("\nSoma dos elementos: " + soma);
    }
}
