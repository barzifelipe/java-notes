package abstracacao_e_interface;

public class Desenvolvedor extends  Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.10;
    }
}
