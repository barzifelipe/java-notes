package abstracacao_e_interface;

public class Gerente extends Funcionario implements Aprovador{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.15;
    }

    @Override
    public void aprovarProjeto(String nomeProjeto) {
        System.out.printf("\nO gerente %s aprovou o projeto %s", nome, nomeProjeto);
    }
}
