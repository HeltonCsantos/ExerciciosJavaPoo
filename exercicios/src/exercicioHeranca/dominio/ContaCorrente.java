package exercicioHeranca.dominio;

public class ContaCorrente extends ContaBancaria{
    private double taxaSaque;

    public  ContaCorrente(String titular, double saldo, double taxaSaque){
        super(titular, saldo);
        setTaxaSaque(taxaSaque);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "taxaSaque=" + taxaSaque +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public void sacar(double valor){
        if(valor <= 0){
            System.out.println("Valor inválido.");
            return;
        }
        double total = valor + this.taxaSaque;
        if (total > this.saldo){
            System.out.println("Saldo indisponivel");
            return;
        }
        this.saldo -= total;
    }

    public double getTaxaSaque() {
        return taxaSaque;
    }

    public void setTaxaSaque(double taxaSaque) {
        if (taxaSaque < 0){
            System.out.println("A taxa deve ser maior que 0.");
            return;
        }
        this.taxaSaque = taxaSaque;
    }
}
