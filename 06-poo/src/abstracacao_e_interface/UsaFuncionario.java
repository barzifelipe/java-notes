package abstracacao_e_interface;

public class UsaFuncionario {
    public static void main(String[] args){
        Funcionario desenvolvedor = new Desenvolvedor("Felipe", 1200);
        Funcionario gerente = new Gerente("Daniel", 4000);

        System.out.println(desenvolvedor.calcularBonus());
        System.out.println(gerente.calcularBonus());
        ((Gerente)gerente).aprovarProjeto("uso de IA nos códigos");
    }
}
