public class Throw {
    public static void main(String[] args){
        try{
            realizarCadastro("Felipe", 16);
            System.out.println("Cadastrado relizado");
        }
        catch(IllegalArgumentException e){
            System.out.println("Erro ao realizar o cadastro");
            System.out.println(e.getMessage());
        }
    }

    public static void realizarCadastro(String nome, int idade){
        if (idade < 18){
            throw new IllegalArgumentException(
                    "O usuário deve ter mais de 18 anos"
            );
        }
        else{
            System.out.println("Usuário " + nome + " cadastrado");
        }
    }
}
