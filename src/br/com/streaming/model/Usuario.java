package br.com.streaming.model;

import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private boolean ativo;
    private List<Video>historicoAssistidos;
    public static final String NOME_PLATAFORMA = "JavaFlix";
    public static int contadorUsuarios = 0;

    //CONSTRUTOR
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        contadorUsuarios ++;
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

    //ToSTRING
    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", email=" + email + ", ativo=" + ativo + ", historicoAssistidos="
                + historicoAssistidos + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + (ativo ? 1231 : 1237);
        result = prime * result + ((historicoAssistidos == null) ? 0 : historicoAssistidos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (ativo != other.ativo)
            return false;
        if (historicoAssistidos == null) {
            if (other.historicoAssistidos != null)
                return false;
        } else if (!historicoAssistidos.equals(other.historicoAssistidos))
            return false;
        return true;
    }

    

    
    
}
