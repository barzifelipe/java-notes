package construtores_e_encapsulamento;

import java.util.Scanner;

public class UsaContaBancaria {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria(1000);
        int opcao;
        double valor;

        System.out.println("Qual o nome do titular da conta?");
        conta1.setTitular(scan.nextLine());
        System.out.println("Bem vindo a sua conta, " + conta1.getTitular());
        do {
            System.out.println("Seu saldo atual é: " + conta1.getSaldo());
            System.out.println("Você deseja: \n1- SACAR\n2- DEPOSITAR\n0- SAIR");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual valor deseja sacar?");
                    valor = scan.nextDouble();
                    conta1.sacar(valor);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Qual valor deseja depositar?");
                    valor = scan.nextDouble();
                    conta1.depositar(valor);
                    System.out.println();
                    break;

                case 0:
                    System.out.println("Encerrando programa");
                    break;

                default:
                    System.out.println("Opção inválida\n");
            }
        }while (opcao != 0);
    }
}
