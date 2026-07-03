import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaArquivo {
    public static void main(String[] args) {

        // false (padrão): sobrescreve o arquivo
        // true: adiciona conteúdo ao final do arquivo (append)
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("arquivo.txt", true))){
            writer.write("Olá");
            writer.newLine();

            writer.write("Este arquivo foi criado usando Java");
            writer.newLine();

            writer.write("Até a próxima");

            System.out.println("Arquivo escrito com sucesso");
        }
        catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo");
            System.out.println(e.getMessage());
        }
    }
}
