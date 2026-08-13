package br.com.streaming.financeiro;

public class CartaoDeCredito {
<<<<<<< HEAD
    private String numero;
    private double limite;

    //CONSTRUTOR
    public CartaoDeCredito(String numero, double limite) {
=======
    private int numero;
    private float limite;

    //CONSTRUTOR
    public CartaoDeCredito(int numero, float limite) {
>>>>>>> 53e5598c393c0dc1e46653f474fdff33a7ba9a53
        this.numero = numero;
        this.limite = limite;
    }

    //GETTERS e SETTERS
<<<<<<< HEAD
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    //toString
    @Override
    public String toString() {
        return "CartaoDeCredito [numero=" + numero + ", limite=" + limite + "]";
    }

}
=======
    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

>>>>>>> 53e5598c393c0dc1e46653f474fdff33a7ba9a53
