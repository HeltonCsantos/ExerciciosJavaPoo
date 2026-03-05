package exercicioHeranca.dominio;

public class Diretor extends FuncionarioExer2 {

    public Diretor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double getPercentualBonus(){
        return 0.3;
    }

}
