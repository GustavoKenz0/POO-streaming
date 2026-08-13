package br.com.streaming.financeiro;

<<<<<<< HEAD
// import br.com.streaming.model.Usuario; // Necessário import devido a pacotes diferentes!

public class Assinatura {
    private String dataInicio;
    private double valor;
    private CartaoDeCredito cartao;
    // private Usuario usuario;

    //CONSTRUTOR
    public Assinatura(String dataInicio, double valor) {
        this.dataInicio = dataInicio;
        this.valor = valor;
    }

    //GETTERS e SETTERS
    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public CartaoDeCredito getCartao() {
        return cartao;
    }

    public void setCartao(CartaoDeCredito cartao) {
        this.cartao = cartao;
    }

    //toString
    @Override
    public String toString() {
        return "Assinatura [dataInicio=" + dataInicio + ", valor=" + valor + ", cartao=" + cartao + "]";
    }

}
=======
import br.com.streaming.model.Usuario;

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
>>>>>>> 53e5598c393c0dc1e46653f474fdff33a7ba9a53
