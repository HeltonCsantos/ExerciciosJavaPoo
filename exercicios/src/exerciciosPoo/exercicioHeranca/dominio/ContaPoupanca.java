package exerciciosPoo.exercicioHeranca.dominio;

public class ContaPoupanca extends ContaBancaria{
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, double taxaRendimento){
        super(titular, saldo);
        setTaxaRendimento(taxaRendimento);
    }

    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Taxa de rendimento: " + this.taxaRendimento);
        System.out.println("-----------------------------");
    }

    public void aplicarRendimento(){
        if(this.taxaRendimento <= 0){
            System.out.println("Taxa de rendimento inválida.");
            return;
        }
        double valorRendido = this.taxaRendimento * this.saldo;
        saldo += valorRendido;
        System.out.println("valor do rendimento: " + valorRendido);
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        if (taxaRendimento < 0){
            System.out.println("A taxa de rendimento deve ser maior que 0.");
            return;
        }
        this.taxaRendimento = taxaRendimento;
    }
}
