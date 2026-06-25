import java.util.Scanner;

public class EntradaSaida {
    public static  void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("=== Cadastro de Usuário ===");

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("\n=== Dados Informados ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);

        scan.close();
    }
}
