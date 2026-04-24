package com.github.emersonsid.padroesdeprojetos;

/**
 * Classe abstrata que implementa o padrão Decorator.
 * Serve como base para todos os decoradores de acréscimos.
 * 
 * A estratégia é manter uma referência a outro Lanche (que pode ser um componente concreto
 * ou outro decorator) e delegar as chamadas para ele, adicionando comportamento próprio.
 */
public abstract class AcrescimoDecorator implements Lanche {
    protected Lanche lanche;
    
    /**
     * Construtor que recebe um Lanche para ser decorado.
     * 
     * @param lanche o lanche a ser decorado (não pode ser nulo)
     * @throws IllegalArgumentException se lanche for nulo
     */
    public AcrescimoDecorator(Lanche lanche) {
        if (lanche == null) {
            throw new IllegalArgumentException("Lanche não pode ser nulo");
        }
        this.lanche = lanche;
    }
}
