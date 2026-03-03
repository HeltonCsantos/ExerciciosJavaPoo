package exerciciosPoo.exercicioHeranca.dominio;

public class PessoaExer1 {
    protected String nome;
    protected int idade;

    public PessoaExer1(String nome) {
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome inválido.");
        }
        this.nome = nome;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()){
            System.out.println("Nome inválido.");
            return;
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            System.out.println("idade invalida.");
            return;
        }
        this.idade = idade;
    }
}
