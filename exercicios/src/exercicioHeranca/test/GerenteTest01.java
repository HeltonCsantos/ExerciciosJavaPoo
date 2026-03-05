package exercicioHeranca.test;

import exercicioHeranca.dominio.Diretor;
import exercicioHeranca.dominio.FuncionarioExer2;
import exercicioHeranca.dominio.Gerente;

public class GerenteTest01 {
    public static void main(String[] args) {
        FuncionarioExer2 funcionarioExer2 = new FuncionarioExer2("Maria", 3000);
        Gerente gerente = new Gerente("Mario", 5000);
        Diretor diretor = new Diretor("Flavio", 10000);

        funcionarioExer2.imprimir();

        gerente.imprimir();

        diretor.imprimir();

    }
}
