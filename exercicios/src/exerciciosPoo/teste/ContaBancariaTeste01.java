package exerciciosPoo.teste;

import exerciciosPoo.dominio.ContaBancaria;

public class ContaBancariaTeste01 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setTitular("Helton");
        contaBancaria.imprime();

        contaBancaria.depositar(1000);
        contaBancaria.imprime();

        contaBancaria.sacar(500);
        contaBancaria.imprime();
    }
}
