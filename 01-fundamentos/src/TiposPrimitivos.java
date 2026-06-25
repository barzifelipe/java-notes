public class TiposPrimitivos {
    public static void main(String[] args){

        //Tipos Inteiros
        byte b = 127;
        short s = 32000;
        int i = 100000;
        long l = 10000000000L;

        //Tipos Decimais
        float f = 10.5f;
        double d = 20.99;

        //Caractere
        char c = 'A';

        //Booleano
        boolean verdadeiro = true;
        boolean falso = false;

        //String (não primitivo)
        String texto = "Exemplo de texto";

        //Conversão de Tipos
        int dInt = (int) d;

        //Par ou Impar
        if(i % 2 ==0){
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }
    }
}
