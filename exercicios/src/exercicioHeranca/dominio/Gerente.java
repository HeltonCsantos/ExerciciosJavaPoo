package exercicioHeranca.dominio;

public class Gerente extends FuncionarioExer2{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    protected double getPercentualBonus(){
        return 0.2;
    }

}
