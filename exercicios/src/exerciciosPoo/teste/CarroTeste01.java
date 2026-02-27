package exerciciosPoo.teste;

import exerciciosPoo.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Fusca", 1983, 100);
        carro.imprimir();
        carro.acelerar(200);
        carro.imprimir();
        carro.frear(20);
        carro.imprimir();
    }
}
