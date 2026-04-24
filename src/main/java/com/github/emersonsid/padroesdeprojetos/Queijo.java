package com.github.emersonsid.padroesdeprojetos;

/**
 * Decorator concreto que adiciona queijo extra a um lanche.
 *
 * Exemplo: new Queijo(new SanduicheHamburger())
 * Adiciona "+2.50" ao preço e ", queijo extra" à descrição.
 */
public class Queijo extends AcrescimoDecorator {
    private static final double PRECO_ACRESCIMO = 2.5;

    public Queijo(Lanche lanche) {
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", queijo extra";
    }

    @Override
    public double preco() {
        return lanche.preco() + PRECO_ACRESCIMO;
    }
}

