package exercicioHeranca.dominio;

public class GatoExer2 extends AnimalExer2{

    public GatoExer2(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau Miau Miau");
    }
}
