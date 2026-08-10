# 📺 Sistema de Streaming - Projeto Starter (POO)

Este projeto é uma base para o aprendizado de **Programação Orientada a Objetos em Java**. Ele simula o funcionamento simplificado de uma plataforma de streaming, focando em conceitos como encapsulamento, pacotes, associações entre objetos e membros estáticos.

## 📂 Estrutura de Pastas e Arquivos

O projeto está dividido em **pacotes** para organizar as responsabilidades de cada classe:

### 📦 `br.com.streaming.model`
Este pacote contém as **Entidades** do sistema (os objetos principais do domínio).

*   **`Video.java`**: Representa um conteúdo audiovisual (filme ou série). Possui título, duração e futuramente será associado a uma categoria.
*   **`Categoria.java`**: Define o gênero do vídeo (Ação, Comédia, etc.) e a classificação indicativa de idade.
*   **`Usuario.java`**: Representa o cliente do serviço. Guarda informações pessoais, o status da conta e o histórico de vídeos que o usuário já assistiu (relação 1 para muitos).

### 📦 `br.com.streaming.financeiro`
Este pacote contém as classes responsáveis pela **Regra de Negócio Financeira**.

*   **`Assinatura.java`**: Controla os detalhes do plano do usuário, como o valor da mensalidade e a data de início.
*   **`CartaoDeCredito.java`**: Armazena os dados de pagamento vinculados a uma assinatura.

### 📦 `br.com.streaming.main`
Este pacote é o **Ponto de Entrada** da aplicação.

*   **`MainTeste.java`**: Contém o método `main`. É aqui que criamos os objetos (`new`), testamos as associações e exibimos os resultados no console para validar o aprendizado.

---

## 🛠️ O que você deve fazer (Desafios)

Cada arquivo contém comentários marcados com `// TODO:`. O objetivo é completar essas tarefas seguindo as aulas:

1.  **Encapsulamento**: Gerar os métodos `Getters` e `Setters` para proteger os dados.
2.  **Construtores**: Garantir que os objetos sejam criados com os dados obrigatórios.
3.  **Associações**:
    *   Fazer um `Video` ter uma `Categoria` (1:1).
    *   Fazer um `Usuario` ter uma lista de `Videos` assistidos (1:N).
4.  **Membros Estáticos**: Criar um contador de usuários e o nome da plataforma que pertençam à classe, não ao objeto individual.
5.  **Boas Práticas**: Implementar `toString()`, `equals()` e `hashCode()` para facilitar a depuração e comparação de dados.

---

## 🚀 Como executar
1. Certifique-se de ter o JDK instalado.
2. Abra o projeto na sua IDE de preferência (VS Code, IntelliJ ou Eclipse).
3. Navegue até o arquivo `MainTeste.java`.
4. Execute o arquivo para ver a saída no terminal.

---
*Este projeto serve como material de apoio pedagógico para o ensino de POO.*
