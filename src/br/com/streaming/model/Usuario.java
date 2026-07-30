package br.com.streaming.model;

import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private boolean ativo;
    private List<Video>historicoAssistidos;

    public Usuario(String nome, String email, boolean ativo,  List<Video> historicoAssistidos) {
        this.nome = nome;
        this.email = email;
        this.ativo = ativo;
        this.historicoAssistidos = historicoAssistidos;
    }

    public void assistirVideoHistorico(Video v) {}
}
