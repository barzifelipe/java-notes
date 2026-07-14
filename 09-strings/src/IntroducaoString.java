import java.util.Scanner;

public class IntroducaoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro texto");
        String texto1 = scanner.nextLine();
        System.out.println("Digite o segundo texto");
        String texto2 = scanner.nextLine();

        if(texto1.equalsIgnoreCase(texto2)){
            System.out.println("Os textos são iguais");
        }

        else {
            System.out.println("Os textos não são iguais");
        }

        String texto3 = texto1.concat(" " + texto2);
        System.out.println(texto3);
    }
}
