package br.com.streaming.model;

public class Video {
    private String titulo;
    private int duracaoEmMinutos;
    private Categoria categoria;

    //CONSTRUTOR
    public Video(String titulo, int duracaoEmMinutos, Categoria categoria) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.categoria = categoria;
    }

    //GETTERS e SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
