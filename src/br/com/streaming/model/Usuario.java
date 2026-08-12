package br.com.streaming.model;

// TODO: Importar List e ArrayList

public class Usuario {
    public static final String NOME_PLATAFORMA = "JavaFlix";
    
    public static int contadorUsuario = 0; 

    private String email;
    private String nome;
    private boolean ativo;
    // TODO: Associação 1..* - Criar Lista de Videos (historicoAssistidos)

    public Usuario(String email, String nome, int contadorUsuario) {
        this.email = email;
        this.nome = nome;
        this.ativo = true;
        contadorUsuario++;
        // TODO: Instanciar a lista de vídeos e incrementar o contador
    }

    public void assistirVideo(Video v) {
        // TODO: Adicionar o vídeo na lista de histórico
    }
    // TODO: Gerar Getters, Setters, equals(), hashCode() e toString()
}
