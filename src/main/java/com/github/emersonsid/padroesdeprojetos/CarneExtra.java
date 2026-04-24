package com.github.emersonsid.padroesdeprojetos;

public class CarneExtra extends AcrescimoDecorator {
    public CarneExtra(Lanche lanche) {
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", carne extra";
    }

    @Override
    public double preco() {
        return lanche.preco() + 5.0;
    }
}
