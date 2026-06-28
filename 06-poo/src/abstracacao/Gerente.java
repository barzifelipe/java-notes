package abstracacao;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public double calcularBonus() {
        return 0.15*salario;
    }
}
