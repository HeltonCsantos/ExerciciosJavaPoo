package exerciciosPoo.dominio;

public class Carro {
    private String modelo;
    private int ano;
    private int velocidaAtual;
    private static final int VELOCIDADE_MAXIMA =  200;

    public Carro() {
    }

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }
    public Carro(String modelo, int ano, int velocidaAtual){
        this(modelo, ano);
        if(velocidaAtual < 0){
            System.out.println("Velocidade inválida");
            return;
        }
        this.velocidaAtual = velocidaAtual;
    }

    public void acelerar(int incremento){
        if (incremento <= 0){
            System.out.println("Valor inválido");
            return;
        }
        this.velocidaAtual += incremento;

        if (velocidaAtual > VELOCIDADE_MAXIMA){
            System.out.println("Limite de velocidade maximo atingido");
            velocidaAtual = VELOCIDADE_MAXIMA;
        }
        System.out.println("Acelerando em " + incremento + " KM");
    }

    public void frear(int decremento){
        if(decremento <= 0){
            System.out.println("Valor inválido");
            return;
        }

        this.velocidaAtual -= decremento;

        if (this.velocidaAtual < 0){
            this.velocidaAtual = 0;
        }
        System.out.println("Freando em " + decremento + " KM");
    }

    public void imprimir(){
        System.out.println(this.modelo);
        System.out.println(this.ano);
        System.out.println(this.velocidaAtual);
        System.out.println("-------------------------------");
    }

}
