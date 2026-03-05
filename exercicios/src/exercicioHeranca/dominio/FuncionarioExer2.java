package exercicioHeranca.dominio;

public class FuncionarioExer2 {
    protected String nome;
    protected double salario;


    public FuncionarioExer2(String nome, double salario){
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome inválido.");
        }
        if (salario <= 0){
            throw new IllegalArgumentException("O salario deve ser maior que 0.");
        }
        this.nome = nome;
        this.salario = salario;
    }

    protected double getPercentualBonus(){
        return 0.1;
    }

    public double calcularBonus(){
        return this.salario * getPercentualBonus();
    }


    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Bonus: " + calcularBonus());
        System.out.println("------------------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()){
            System.out.println("Nome inválido");
            return;
        }
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0){
            System.out.println("O salario deve ser maior que 0.");
            return;
        }
        this.salario = salario;
    }
}
