package br.com.streaming.main;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.streaming.model.Produto;

public class MainTeste {
    public static void main(String[] args) {
        List<Produto> carrinhoList = new ArrayList<>();
        List<Produto> favoritos = new ArrayList<>();

        System.out.println("=== SISTEMA DE STREAMING ===");

        carrinhoList.add(new Produto("Filtro de Óleo Yamaha R3", 85.00));
        carrinhoList.add(new Produto("Camisa do Corinthians", 299.90));
        carrinhoList.add(new Produto("Bola de Basquete", 150.00));
        carrinhoList.add(new Produto("Bolha Esportiva R3", 350.00));

        System.out.println("Carrinho cheio!");

        Produto bola = new Produto("Bola de Basquete", 150.00);
        favoritos.add(bola);
        favoritos.add(bola); // O clique acidental

        System.out.println("Tamanho dos favoritos: " + favoritos.size());

        // HashSet
        Set<Produto> favoritos2 = new HashSet<>();
        Produto bola2 = new Produto("Bola de Basquete", 150.00);

        favoritos2.add(bola2);
        favoritos2.add(bola2); // Será solenemente ignorado
        System.out.println("Tamanho: " + favoritos2.size()); // Imprime 1

        // Bug HashSet
        Set<Produto> favoritos3 = new HashSet<>();
        Produto p1 = new Produto("Capacete", 500.00);
        Produto p2 = new Produto("Capacete", 500.00);

        favoritos3.add(p1);
        favoritos3.add(p2);

        System.out.println("Tamanho: " + favoritos3.size());
    }
=======
import br.com.streaming.model.Usuario;

public class MainTeste {
    public static void main(String[] args){

        Usuario u1 = new Usuario(null, null);
        u1.setEmail("joao@gmail.com");    

        Usuario u2 = new Usuario(null, null);
        u2.setEmail("joao@gmail.com");


        if (u1.equals(u2)) {
            System.out.println("Erro: Usuário já existe!");
        } else {
            System.out.println("Cadastro liberado!");
        }

        System.out.println(Usuario.NOME_PLATAFORMA);
    }

    

>>>>>>> 53e5598c393c0dc1e46653f474fdff33a7ba9a53
}
