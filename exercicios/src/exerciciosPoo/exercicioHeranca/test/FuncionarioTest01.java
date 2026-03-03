package exerciciosPoo.exercicioHeranca.test;

import exerciciosPoo.exercicioHeranca.dominio.FuncionarioExer1;

public class FuncionarioTest01 {

    public static void main(String[] args) {
        FuncionarioExer1 funcionarioExer1 = new FuncionarioExer1("Helton");
        funcionarioExer1.setIdade(21);
        funcionarioExer1.setSalario(2500);

        funcionarioExer1.imprimir();
    }
}
