package exerciciosEnum.dominio;

public enum DiasDaSemana {
    DOM("Domingo"),
    SEG("Segunda"),
    TER("Terça"),
    QUA("Quarta"),
    QUI("Quinta"),
    SEX("Sexta"),
    SAB("Sábado");

    private String nomeCompleto;

    DiasDaSemana(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
}
