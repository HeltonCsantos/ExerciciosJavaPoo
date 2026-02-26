package exerciciosPoo.teste;

import exerciciosPoo.dominio.Usuario;

public class UsuarioTeste01 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setUsername("Helton");
        usuario.setSenha("12345678");
        usuario.imprime();
        usuario.alterarSenha("12345678", "12345678910");
        usuario.imprime();

    }
}
