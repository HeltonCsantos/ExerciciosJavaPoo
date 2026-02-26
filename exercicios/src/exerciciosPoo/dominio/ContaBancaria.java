package exerciciosPoo.dominio;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Valor invádo.");
            return;
        }
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido.");
            return;
        }
        if (this.saldo < valor){
            System.out.println("Saldo indisponivel");
            return;
        }
        this.saldo = this.saldo - valor;
    }

    public void imprime(){
        System.out.println("Nome do titular: " + this.titular);
        System.out.println("Saldo da conta: " + this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        boolean sacou = true;
        if (titular == null || titular.isEmpty()){
            System.out.println("Titular Inválido");
            return;
        }
        this.titular = titular;
    }
}
