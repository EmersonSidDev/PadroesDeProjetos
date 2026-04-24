package com.github.emersonsid.padroesdeprojetos;

/**
 * Decorator concreto que adiciona maionese a um lanche.
 *
 * Exemplo: new Maionese(new SanduicheHamburger())
 * Adiciona "+1.50" ao preço e ", maionese" à descrição.
 */
public class Maionese extends AcrescimoDecorator {
    private static final double PRECO_ACRESCIMO = 1.5;

    public Maionese(Lanche lanche) {
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", maionese";
    }

    @Override
    public double preco() {
        return lanche.preco() + PRECO_ACRESCIMO;
    }
}

