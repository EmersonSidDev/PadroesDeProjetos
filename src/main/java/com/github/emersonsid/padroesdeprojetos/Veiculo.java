package com.github.emersonsid.padroesdeprojetos;

public abstract class Veiculo {
    protected Motor motor;

    public Veiculo(Motor motor) {
        this.motor = motor;
    }

    public abstract void movimentar();
}
