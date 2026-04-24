package com.github.emersonsid.padroesdeprojetos;

/**
 * Interface que define o contrato para componentes do padrão Decorator.
 * Representa um lanche que pode ser decorado com acréscimos.
 * 
 * O padrão Decorator permite adicionar responsabilidades dinamicamente a objetos,
 * fornecendo uma alternativa flexível à herança para estender funcionalidade.
 */
public interface Lanche {
    /**
     * Retorna a descrição do lanche com seus acréscimos.
     * @return descrição textual do lanche
     */
    String getDescricao();
    
    /**
     * Calcula o preço total do lanche incluindo seus acréscimos.
     * @return preço em reais
     */
    double preco();
}
