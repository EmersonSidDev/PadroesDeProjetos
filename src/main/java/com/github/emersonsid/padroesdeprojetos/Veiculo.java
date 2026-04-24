package com.github.emersonsid.padroesdeprojetos;

/**
 * Classe abstrata Veiculo - Abstração no padrão Bridge.
 * Representa um veículo que utiliza um motor, permitindo a combinação de diferentes tipos de veículos com diferentes tipos de motores.
 */
public abstract class Veiculo {
    protected Motor motor;

    public Veiculo(Motor motor) {
        this.motor = motor;
    }

    public abstract void movimentar();
}
