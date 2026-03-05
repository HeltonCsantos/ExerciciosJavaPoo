package exercicioHeranca.test;

import exercicioHeranca.dominio.CachorroExer2;
import exercicioHeranca.dominio.GatoExer2;

public class AnimalTest01 {
    public static void main(String[] args) {
        GatoExer2 gato = new GatoExer2("MiMi");
        gato.emitirSom();

        CachorroExer2 cachorro = new CachorroExer2("Rex");
        cachorro.emitirSom();
    }
}
