package exerciciosEnum.test;

import exerciciosEnum.dominio.TipoCliente;

import java.util.Scanner;

public class TipoClienteTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o tipo de cliente:");
        System.out.println("1 - PESSOA_FISICA (10% desconto)");
        System.out.println("2 - PESSOA_JURIDICA (5% desconto)");
        System.out.print("Opção: ");
        int op = sc.nextInt();

        TipoCliente tipo;

        switch (op){
            case 1:
                tipo = TipoCliente.PESSOA_FISICA;
                break;
            case 2:
                tipo = TipoCliente.PESSOA_JURIDICA;
                break;
            default:
                throw new IllegalArgumentException("Opção inválida.");
        }

        System.out.print("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        double valorFinal = tipo.calcularDesconto(valor);

        System.out.println("Tipo: " + tipo);
        System.out.println("Desconto: " + (tipo.getDesconto() * 100) + "%");
        System.out.println("Valor final: " + valorFinal);
    }

}
