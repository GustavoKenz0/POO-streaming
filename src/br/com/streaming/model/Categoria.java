package br.com.streaming.model;

public class Categoria {

    private String nome;
    private int classificacaoIdade;

    //CONSTRUTOR
    public Categoria(String nome, int classificacaoIdade) {
        this.nome = nome;
        this.classificacaoIdade = classificacaoIdade;
    }

    //GETTERS e SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getClassificacaoIdade() {
        return classificacaoIdade;
    }

    public void setClassificacaoIdade(int classificacaoIdade) {
        this.classificacaoIdade = classificacaoIdade;
    }

    //toString
    @Override
    public String toString() {
        return "Categoria [nome=" + nome + ", classificacaoIdade=" + classificacaoIdade + "]";
    }

}
