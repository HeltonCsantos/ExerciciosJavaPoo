package exerciciosPoo.dominio;

public class Cliente {
    private String nomeCliente;
    static int totalClientes;

//    {
//            totalClientes++;
//    }

    public Cliente(String nomeCliente) {
        if(nomeCliente == null || nomeCliente.isEmpty()){
            System.out.println("Preencha um nome valido.");
            return;
        }
        this.nomeCliente = nomeCliente;
        totalClientes++; // usado no metodo para evitar contagem de nomes invalidos
    }

    public void imprime(){
        System.out.println("Nome: " + this.nomeCliente);
        System.out.println("Total de clientes: " + totalClientes);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public static void exibirTotalClientes(){
        System.out.println("Total de clientes criados: " + totalClientes);
    }

}
