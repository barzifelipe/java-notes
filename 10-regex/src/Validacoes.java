public class Validacoes {
    public static void main(String[] args) {

        String email = "felipe@gmail.com";

        System.out.println("E-mail");
        System.out.println(email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"));

        String cep = "12345-678";

        System.out.println("\nCEP");
        System.out.println(cep.matches("\\d{5}-\\d{3}"));

        String telefone = "(27) 99999-9999";

        System.out.println("\nTelefone");
        System.out.println(telefone.matches("\\(\\d{2}\\) \\d{4,5}-\\d{4}"));

        String cpf = "123.456.789-10";

        System.out.println("\nCPF");
        System.out.println(cpf.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}"));

        // Senha
        // Pelo menos 8 caracteres contendo letras e números.

        String senha = "Java1234";

        System.out.println("\nSenha");
        System.out.println(senha.matches("^(?=.*[A-Za-z])(?=.*\\d).{8,}$"));

        // Apenas letras

        String nome = "Felipe";

        System.out.println("\nApenas letras:");
        System.out.println(nome.matches("[A-Za-z]+"));

        // Apenas números

        String numero = "123456";

        System.out.println("\nApenas números:");
        System.out.println(numero.matches("\\d+"));

        // Placa Mercosul

        String placa = "ABC1D23";

        System.out.println("\nPlaca Mercosul:");
        System.out.println(placa.matches("[A-Z]{3}\\d[A-Z]\\d{2}"));
    }
}
