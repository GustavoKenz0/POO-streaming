package br.com.streaming.main;

import br.com.streaming.model.Usuario;

public class MainTeste {
    public static void main(String[] args){

        Usuario u1 = new Usuario(null, null);
        u1.setEmail("joao@gmail.com");    

        Usuario u2 = new Usuario(null, null);
        u2.setEmail("joao@gmail.com");


        if (u1.equals(u2)) {
            System.out.println("Erro: Usuário já existe!");
        } else {
            System.out.println("Cadastro liberado!");
        }

        System.out.println(Usuario.NOME_PLATAFORMA);
    }

    

}
