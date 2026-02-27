package exerciciosPoo.teste;

import exerciciosPoo.dominio.Cliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Helton");
        Cliente cliente2 = new Cliente("Fabio");
        Cliente cliente3 = new Cliente("Carlos");

        Cliente.exibirTotalClientes();

    }
}
