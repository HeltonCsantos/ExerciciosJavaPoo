package exerciciosEnum.test;

import exerciciosEnum.dominio.DiasDaSemana;

public class DiasDaSemanaTest {
    public static void main(String[] args) {
        DiasDaSemana diasDaSemana = DiasDaSemana.QUI;

        for (DiasDaSemana dia : DiasDaSemana.values()){
            System.out.println(dia);
        }

        switch (diasDaSemana){
            case SAB:
            case DOM:
                System.out.println(diasDaSemana.getNomeCompleto() + "é um dia do fim de samana");
                break;
            default:
                System.out.println(diasDaSemana.getNomeCompleto() + " é um dia útil");
        }

    }
}
