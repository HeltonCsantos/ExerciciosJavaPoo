package exercicioHeranca.dominio;

public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo){
        if (titular == null || titular.isBlank()){
            throw new IllegalArgumentException("Nome invalido.");
        }
        if (saldo < 0){
            throw new IllegalArgumentException("O saldo não pode ser negativo");
        }
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void sacar(double valor){
        if (valor <= 0){
            System.out.println("Valor invalido");
            return;
        }
        if (valor > this.saldo){
            System.out.println("Sem saldo suficiente");
            return;
        }
        this.saldo -= valor;
    }

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor invalido");
            return;
        }
        this.saldo += valor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isBlank()){
            System.out.println("nome invalido.");
            return;
        }
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

}
