package br.com.streaming.financeiro;

public class Assinatura {
    private int dataInicio;
    private float valor;
    private CartaoDeCredito cartaoDeCredito;
    private Usuario usuario;

    //CONSTRUTOR
    public Assinatura(int dataInicio, float valor, CartaoDeCredito cartaoDeCredito, Usuario usuario) {
        this.dataInicio = dataInicio;
        this.valor = valor;
        this.cartaoDeCredito = cartaoDeCredito;
        this.usuario = usuario;
    }

    //GETTERS e SETTERS
    public int getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(int dataInicio) {
        this.dataInicio = dataInicio;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public CartaoDeCredito getCartaoDeCredito() {
        return cartaoDeCredito;
    }

    public void setCartaoDeCredito(CartaoDeCredito cartaoDeCredito) {
        this.cartaoDeCredito = cartaoDeCredito;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}