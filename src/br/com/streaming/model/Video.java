package br.com.streaming.model;

public class Video {
    private String titulo;
    private int duracaoEmMinutos;
    private Categoria categoria;
    
    // TODO: Associação 1:1 - Adicionar atributo do tipo Categoria
    
    public Video(String titulo, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    
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

    //HashCode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + duracaoEmMinutos;
        result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
        return result;
    }

    //Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Video other = (Video) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (duracaoEmMinutos != other.duracaoEmMinutos)
            return false;
        if (categoria == null) {
            if (other.categoria != null)
                return false;
        } else if (!categoria.equals(other.categoria))
            return false;
        return true;
    }

    //toString
    @Override
    public String toString() {
        return "Video [titulo=" + titulo + ", duracaoEmMinutos=" + duracaoEmMinutos + ", categoria=" + categoria + "]";
    }


}
