package exerciciosPoo.dominio;

public class Usuario {
    private String username;
    private String senha;

    public void alterarSenha(String senhaAtual, String novaSenha) {
        if (this.senha == null){
            System.out.println("Nenhuma senha cadastrada.");
            return;
        }
        if (!this.senha.equals(senhaAtual)){
            System.out.println("Senha atual errada");
            return;
        }
        if (novaSenha == null || novaSenha.length() < 8){
            System.out.println("A senha deve ter pelo menos 8 caracteres.");
            return;
        }
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso!!");
    }

    public void imprime() {
        System.out.println("Nome: " + username);
        if (this.senha != null) {
            System.out.print("Senha: ");
            for (int i = 0; i < this.senha.length(); i++) {
                System.out.print("*");
            }
        }
        System.out.println("\n-------------------------------");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null || username.isEmpty()) {
            System.out.println("Dados Invalidos");
            return;
        }
        this.username = username;
    }

    public void setSenha(String senha) {
        if (senha == null || senha.length() < 8) {
            System.out.println("A senha deve ter pelo menos 8 caracteres.");
            return;
        }
        this.senha = senha;
        System.out.println("Senha Adicionada.");
    }
}
