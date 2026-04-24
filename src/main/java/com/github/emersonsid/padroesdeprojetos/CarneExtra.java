package com.github.emersonsid.padroesdeprojetos;

/**
 * Decorator concreto que adiciona carne extra a um lanche.
 *
 * Exemplo: new CarneExtra(new SanduicheHamburger())
 * Adiciona "+5.00" ao preço e ", carne extra" à descrição.
 */
public class CarneExtra extends AcrescimoDecorator {
    private static final double PRECO_ACRESCIMO = 5.0;

    public CarneExtra(Lanche lanche) {
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", carne extra";
    }

    @Override
    public double preco() {
        return lanche.preco() + PRECO_ACRESCIMO;
    }
}
