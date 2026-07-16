public class Caixa<T> {

    private T objeto;
    private String proprietario;
    private int capacidade;

    public Caixa(String proprietario, int capacidade){
        this.proprietario = proprietario;
        this.capacidade = capacidade;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public String getProprietario() {
        return proprietario;
    }

    public int getCapacidade() {
        return capacidade;
    }
}
