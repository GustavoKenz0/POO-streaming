package br.com.streaming.model;

public class Video {
    private String titulo;
    private int duracaoEmMinutos;
<<<<<<< HEAD
    
    // TODO: Associação 1:1 - Adicionar atributo do tipo Categoria
    
    public Video(String titulo, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    // TODO: Gerar Getters, Setters, equals(), hashCode() e toString()
=======
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
>>>>>>> 53e5598c393c0dc1e46653f474fdff33a7ba9a53
}
