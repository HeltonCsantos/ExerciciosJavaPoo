package exerciciosEnum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(0.1),
    PESSOA_JURIDICA(0.05);

    private final double desconto;

    TipoCliente(double desconto) {
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public double calcularDesconto(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor não pode ser negativo");
        }
        return valor - (valor * this.desconto);
    }

}
