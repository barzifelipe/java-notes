package construtores_e_encapsulamento;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
        }

        else {
            System.out.println("Saldo insuficiente");
        }
    }
}
