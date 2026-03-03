package exerciciosPoo.exercicioHeranca.test;

import exerciciosPoo.exercicioHeranca.dominio.ContaPoupanca;

public class ContaPoupancaTest01 {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("Helton", 1200, 0.05);
        contaPoupanca.imprime();
        contaPoupanca.aplicarRendimento();
        contaPoupanca.imprime();
        contaPoupanca.sacar(1000);
        contaPoupanca.imprime();
        contaPoupanca.depositar(80000);
        contaPoupanca.imprime();
        contaPoupanca.sacar(200000);
        contaPoupanca.imprime();
        contaPoupanca.aplicarRendimento();
        contaPoupanca.imprime();
    }
}
