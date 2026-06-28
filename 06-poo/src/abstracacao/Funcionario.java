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

package abstracacao;

public abstract class Funcionario {

    String nome;
    double salario;

    public abstract double calcularBonus();
}