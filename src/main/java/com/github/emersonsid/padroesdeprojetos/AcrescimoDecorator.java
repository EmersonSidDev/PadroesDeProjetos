package com.github.emersonsid.padroesdeprojetos;

public abstract class AcrescimoDecorator extends Lanche{
    protected Lanche lanche;

    public AcrescimoDecorator(Lanche lanche) {
        this.lanche = lanche;
    }
}
