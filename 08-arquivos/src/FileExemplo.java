import java.io.File;

public class FileExemplo {
    public static void main(String [] args){
        File arquivo = new File("arquivo.txt");

        System.out.println("Nome: " + arquivo.getName());
        System.out.println("Caminho: " + arquivo.getPath());
        System.out.println("Caminho absoluto: " + arquivo.getAbsolutePath());

        System.out.println();

        if(arquivo.exists()){
            System.out.println("O arquivo existe");
            System.out.println("É um arquivo? " + arquivo.isFile());
            System.out.println("É um diretório? " + arquivo.isDirectory());
            System.out.println("Tamanho: " + arquivo.length() + " bytes");
        }
        else{
            System.out.println("O arquivo não foi encontrado");
        }
    }
}
