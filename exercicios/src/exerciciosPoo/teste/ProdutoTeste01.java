package exerciciosPoo.teste;

import exerciciosPoo.dominio.Produto;

public class ProdutoTeste01 {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.setNome("Abacaxi");
        produto.setPreco(10.50);
        produto.setQuantidade(15);

        produto.imprimirDados();

        double desconto = produto.aplicarDesconto(0.10);
        System.out.println("Desconto aplicado: " + desconto);
        System.out.println("Novo preço: " + produto.getPreco());
    }
}
