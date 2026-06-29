/*Crie uma classe abstrata Funcionario.

Ela deve possuir:

- nome
- salário

E um método abstrato:

calcularBonus()

Depois crie:

- Gerente
- Desenvolvedor

Cada um deve calcular um bônus diferente.*/

package abstracacao_e_interface;

public abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularBonus();
}