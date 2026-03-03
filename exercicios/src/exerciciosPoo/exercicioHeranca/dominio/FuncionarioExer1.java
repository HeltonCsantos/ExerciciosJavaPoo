package exerciciosPoo.exercicioHeranca.dominio;

public class FuncionarioExer1 extends PessoaExer1 {
    private double salario;

    public FuncionarioExer1(String nome) {
        super(nome);
    }

    @Override
    public void imprimir(){
        super .imprimir();
        System.out.println("Salario: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario < 0){
            System.out.println("O salario não pode ser negativo");
            return;
        }
        this.salario = salario;
    }
}
