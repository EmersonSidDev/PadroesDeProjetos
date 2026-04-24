package com.github.emersonsid.padroesdeprojetos;

public class Bacon extends AcrescimoDecorator {
    public Bacon(Lanche lanche) {
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", bacon";
    }

    @Override
    public double preco() {
        return lanche.preco() + 3.0;
    }
}
