package exerciciosPoo.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public double calcularValorTotal() {
        return this.quantidade * this.preco;
    }

    public double aplicarDesconto(double percentual) {
        if (percentual <= 0 || percentual > 1) {
            System.out.println("Desconto Inviável.");
            return 0;
        }
        double desconto = this.preco * percentual;
        this.preco -= desconto;
        return desconto;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Não é possivel adicionar um estoque negativo.");
            return;
        }
        this.quantidade = this.quantidade + quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Não é possivel remover um estoque negativo.");
            return;
        }
        if(quantidade > this.quantidade){
            System.out.println("Estoque Insuficiente");
            return;
        }
        this.quantidade = this.quantidade - quantidade;
    }


    public void imprimirDados() {
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("O valor total é: " + calcularValorTotal());
        System.out.println("---------------------------------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (this.preco < 0) {
            return;
        }
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (this.quantidade < 0) {
            return;
        }
        this.quantidade = quantidade;
    }
}
