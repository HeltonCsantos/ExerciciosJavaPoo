package exerciciosEnum.dominio;

public enum StatusPedido {
    PENDENTE(1),
    PAGO(2),
    ENVIADO(3),
    ENTREGUE(4),
    CANCELADO(5);

    private int numeroPedido;

    StatusPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public static StatusPedido getByNumero(int numero){
        for(StatusPedido status : StatusPedido.values()){
            if(status.getNumeroPedido() == numero){
                return status;
            }
        }
        throw new IllegalArgumentException("Número inválido.");
    }
}
