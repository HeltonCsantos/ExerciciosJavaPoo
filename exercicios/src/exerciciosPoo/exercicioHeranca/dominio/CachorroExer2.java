package exerciciosPoo.exercicioHeranca.dominio;

public class CachorroExer2 extends AnimalExer2{

    public CachorroExer2(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Au Au Au");
    }

}
