package classe_e_objeto;

public class UsaPessoa {
    public static void main(String[] args){

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Felipe";
        pessoa1.idade = 26;

        pessoa1. apresentar();

        Pessoa pessoa2 = new Pessoa();

        pessoa2.nome = "Maria";
        pessoa2.idade = 30;

        pessoa2.apresentar();
    }
}
