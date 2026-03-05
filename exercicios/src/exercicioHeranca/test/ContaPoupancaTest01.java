package exercicioHeranca.test;

import exercicioHeranca.dominio.ContaCorrente;
import exercicioHeranca.dominio.ContaPoupanca;

public class ContaPoupancaTest01 {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("Helton", 1200, 0.05);
        System.out.println(contaPoupanca);
        contaPoupanca.aplicarRendimento();
        System.out.println(contaPoupanca);
        contaPoupanca.sacar(1000);
        System.out.println(contaPoupanca);
        contaPoupanca.depositar(80000);
        System.out.println(contaPoupanca);
        contaPoupanca.sacar(200000);
        System.out.println(contaPoupanca);
        contaPoupanca.aplicarRendimento();
        System.out.println(contaPoupanca);


        ContaCorrente contaCorrente = new ContaCorrente("João", 100, 2);
        contaCorrente.sacar(20);
        System.out.println(contaCorrente);

    }
}
