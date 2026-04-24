package com.github.emersonsid.padroesdeprojetos;

/**
 * Decorator concreto que adiciona bacon a um lanche.
 *
 * Exemplo: new Bacon(new SanduicheHamburger())
 * Adiciona "+3.00" ao preço e ", bacon" à descrição.
 */
public class Bacon extends AcrescimoDecorator {
    private static final double PRECO_ACRESCIMO = 3.0;

    public Bacon(Lanche lanche) {
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", bacon";
    }

    @Override
    public double preco() {
        return lanche.preco() + PRECO_ACRESCIMO;
    }
}
