package br.com.streaming.model;

import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private boolean ativo;
    private List<Video>historicoAssistidos;

    //CONSTRUTOR
    public Usuario(String nome, String email, boolean ativo,  List<Video> historicoAssistidos) {
        this.nome = nome;
        this.email = email;
        this.ativo = ativo;
        this.historicoAssistidos = historicoAssistidos;
    }

    //GETTER e SETTER
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<Video> getHistoricoAssistidos() {
        return historicoAssistidos;
    }

    public void setHistoricoAssistidos(List<Video> historicoAssistidos) {
        this.historicoAssistidos = historicoAssistidos;
    }

    public void assistirVideoHistorico(Video v) {}
}
