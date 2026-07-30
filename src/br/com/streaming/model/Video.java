package br.com.streaming.model;

public class Video {
    private String titulo;
    private int duracaoEmMinutos;
    private Categoria categoria;

    public Video(String titulo, int duracaoEmMinutos, Categoria categoria) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.categoria = categoria;
    }
}
