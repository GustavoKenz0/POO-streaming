package br.com.streaming.financeiro;

public class CartaoDeCredito {
    private int numero;
    private float limite;

    //CONSTRUTOR
    public CartaoDeCredito(int numero, float limite) {
        this.numero = numero;
        this.limite = limite;
    }

    //GETTERS e SETTERS
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

