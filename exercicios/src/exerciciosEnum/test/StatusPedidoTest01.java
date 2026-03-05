package exerciciosEnum.test;

import exerciciosEnum.dominio.StatusPedido;

import java.util.Scanner;

public class StatusPedidoTest01 {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        System.out.println("Digite o status do pedido:");
        System.out.println("1-PENDENTE, 2-PAGO, 3-ENVIADO, 4-ENTREGUE ou 5-CANCELADO");
        System.out.print("Opção: ");
        int opcao = op.nextInt();

        StatusPedido statusPedido= StatusPedido.getByNumero(opcao);

        System.out.println("Status escolhido: " + statusPedido);
    }
}
